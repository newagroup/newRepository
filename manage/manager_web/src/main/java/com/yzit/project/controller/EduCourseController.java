package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.EduCourse;
import com.yzit.project.service.EduCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>课程表--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/eduCourse")
public class EduCourseController extends BaseController {
	@Autowired
	private EduCourseService eduCourseService;

	//@RequiresPermissions("system: eduCourse:list")
	@PostMapping("/list")
	public TableDataInfo list(EduCourse  eduCourse) {
		startPage();
		List<EduCourse> list = eduCourseService.findByList( eduCourse);
		return getDataTable(list);
	}

	/*@Log(title = "课程表管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: eduCourse:export")
	@GetMapping("/export")
	public AjaxResult export(EduCourse  eduCourse) {
		List<EduCourse> list = eduCourseService.findByList( eduCourse);
		ExcelUtil<EduCourse> util = new ExcelUtil<EduCourse>(Role.class);
		return util.exportExcel(list, "课程表数据");
	}*/

	/**
	 * 根据课程表编号获取详细信息
	 */
	//@RequiresPermissions("system: eduCourse:query")
	@GetMapping(value = "/{eduCourseId}")
	public AjaxResult getInfo(@PathVariable Long  eduCourseId) {
		return AjaxResult.success(eduCourseService.findById( eduCourseId));
	}

	/**
	 * 新增课程表
	 */
	//@RequiresPermissions("system: eduCourse:add")
	@Log(title = "课程表管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody EduCourse  eduCourse) {
		return toAjax(eduCourseService.save( eduCourse));

	}

	/**
	 * 修改保存课程表
	 */
	//@RequiresPermissions("system: eduCourse:edit")
	@Log(title = "课程表管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody EduCourse  eduCourse) {
		return toAjax(eduCourseService.update( eduCourse));
	}
	
	
	/**
	 * 删除课程表
	 */
	//@RequiresPermissions("system: eduCourse:remove")
	@Log(title = "课程表管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(eduCourseService.delByIds(ids));
	}
}