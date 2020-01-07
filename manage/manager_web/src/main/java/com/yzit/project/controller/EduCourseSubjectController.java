package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.EduCourseSubject;
import com.yzit.project.service.EduCourseSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>课程与科目中间表--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/eduCourseSubject")
public class EduCourseSubjectController extends BaseController {
	@Autowired
	private EduCourseSubjectService eduCourseSubjectService;

	//@RequiresPermissions("system: eduCourseSubject:list")
	@PostMapping("/list")
	public TableDataInfo list(EduCourseSubject  eduCourseSubject) {
		startPage();
		List<EduCourseSubject> list = eduCourseSubjectService.findByList( eduCourseSubject);
		return getDataTable(list);
	}

	/*@Log(title = "课程与科目中间表管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: eduCourseSubject:export")
	@GetMapping("/export")
	public AjaxResult export(EduCourseSubject  eduCourseSubject) {
		List<EduCourseSubject> list = eduCourseSubjectService.findByList( eduCourseSubject);
		ExcelUtil<EduCourseSubject> util = new ExcelUtil<EduCourseSubject>(Role.class);
		return util.exportExcel(list, "课程与科目中间表数据");
	}*/

	/**
	 * 根据课程与科目中间表编号获取详细信息
	 */
	//@RequiresPermissions("system: eduCourseSubject:query")
	@GetMapping(value = "/{eduCourseSubjectId}")
	public AjaxResult getInfo(@PathVariable Long  eduCourseSubjectId) {
		return AjaxResult.success(eduCourseSubjectService.findById( eduCourseSubjectId));
	}

	/**
	 * 新增课程与科目中间表
	 */
	//@RequiresPermissions("system: eduCourseSubject:add")
	@Log(title = "课程与科目中间表管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody EduCourseSubject  eduCourseSubject) {
		return toAjax(eduCourseSubjectService.save( eduCourseSubject));

	}

	/**
	 * 修改保存课程与科目中间表
	 */
	//@RequiresPermissions("system: eduCourseSubject:edit")
	@Log(title = "课程与科目中间表管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody EduCourseSubject  eduCourseSubject) {
		return toAjax(eduCourseSubjectService.update( eduCourseSubject));
	}
	
	
	/**
	 * 删除课程与科目中间表
	 */
	//@RequiresPermissions("system: eduCourseSubject:remove")
	@Log(title = "课程与科目中间表管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(eduCourseSubjectService.delByIds(ids));
	}
}