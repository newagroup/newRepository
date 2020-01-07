package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.EduCourseNote;
import com.yzit.project.service.EduCourseNoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>课程笔记--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/eduCourseNote")
public class EduCourseNoteController extends BaseController {
	@Autowired
	private EduCourseNoteService eduCourseNoteService;

	//@RequiresPermissions("system: eduCourseNote:list")
	@PostMapping("/list")
	public TableDataInfo list(EduCourseNote  eduCourseNote) {
		startPage();
		List<EduCourseNote> list = eduCourseNoteService.findByList( eduCourseNote);
		return getDataTable(list);
	}

	/*@Log(title = "课程笔记管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: eduCourseNote:export")
	@GetMapping("/export")
	public AjaxResult export(EduCourseNote  eduCourseNote) {
		List<EduCourseNote> list = eduCourseNoteService.findByList( eduCourseNote);
		ExcelUtil<EduCourseNote> util = new ExcelUtil<EduCourseNote>(Role.class);
		return util.exportExcel(list, "课程笔记数据");
	}*/

	/**
	 * 根据课程笔记编号获取详细信息
	 */
	//@RequiresPermissions("system: eduCourseNote:query")
	@GetMapping(value = "/{eduCourseNoteId}")
	public AjaxResult getInfo(@PathVariable Long  eduCourseNoteId) {
		return AjaxResult.success(eduCourseNoteService.findById( eduCourseNoteId));
	}

	/**
	 * 新增课程笔记
	 */
	//@RequiresPermissions("system: eduCourseNote:add")
	@Log(title = "课程笔记管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody EduCourseNote  eduCourseNote) {
		return toAjax(eduCourseNoteService.save( eduCourseNote));

	}

	/**
	 * 修改保存课程笔记
	 */
	//@RequiresPermissions("system: eduCourseNote:edit")
	@Log(title = "课程笔记管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody EduCourseNote  eduCourseNote) {
		return toAjax(eduCourseNoteService.update( eduCourseNote));
	}
	
	
	/**
	 * 删除课程笔记
	 */
	//@RequiresPermissions("system: eduCourseNote:remove")
	@Log(title = "课程笔记管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(eduCourseNoteService.delByIds(ids));
	}
}