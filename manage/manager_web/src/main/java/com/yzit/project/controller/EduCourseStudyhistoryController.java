package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.EduCourseStudyhistory;
import com.yzit.project.service.EduCourseStudyhistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>课程学习记录--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/eduCourseStudyhistory")
public class EduCourseStudyhistoryController extends BaseController {
	@Autowired
	private EduCourseStudyhistoryService eduCourseStudyhistoryService;

	//@RequiresPermissions("system: eduCourseStudyhistory:list")
	@PostMapping("/list")
	public TableDataInfo list(EduCourseStudyhistory  eduCourseStudyhistory) {
		startPage();
		List<EduCourseStudyhistory> list = eduCourseStudyhistoryService.findByList( eduCourseStudyhistory);
		return getDataTable(list);
	}

	/*@Log(title = "课程学习记录管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: eduCourseStudyhistory:export")
	@GetMapping("/export")
	public AjaxResult export(EduCourseStudyhistory  eduCourseStudyhistory) {
		List<EduCourseStudyhistory> list = eduCourseStudyhistoryService.findByList( eduCourseStudyhistory);
		ExcelUtil<EduCourseStudyhistory> util = new ExcelUtil<EduCourseStudyhistory>(Role.class);
		return util.exportExcel(list, "课程学习记录数据");
	}*/

	/**
	 * 根据课程学习记录编号获取详细信息
	 */
	//@RequiresPermissions("system: eduCourseStudyhistory:query")
	@GetMapping(value = "/{eduCourseStudyhistoryId}")
	public AjaxResult getInfo(@PathVariable Long  eduCourseStudyhistoryId) {
		return AjaxResult.success(eduCourseStudyhistoryService.findById( eduCourseStudyhistoryId));
	}

	/**
	 * 新增课程学习记录
	 */
	//@RequiresPermissions("system: eduCourseStudyhistory:add")
	@Log(title = "课程学习记录管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody EduCourseStudyhistory  eduCourseStudyhistory) {
		return toAjax(eduCourseStudyhistoryService.save( eduCourseStudyhistory));

	}

	/**
	 * 修改保存课程学习记录
	 */
	//@RequiresPermissions("system: eduCourseStudyhistory:edit")
	@Log(title = "课程学习记录管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody EduCourseStudyhistory  eduCourseStudyhistory) {
		return toAjax(eduCourseStudyhistoryService.update( eduCourseStudyhistory));
	}
	
	
	/**
	 * 删除课程学习记录
	 */
	//@RequiresPermissions("system: eduCourseStudyhistory:remove")
	@Log(title = "课程学习记录管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(eduCourseStudyhistoryService.delByIds(ids));
	}
}