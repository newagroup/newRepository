package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.EduWebsiteCourse;
import com.yzit.project.service.EduWebsiteCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>课程网站链接--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/eduWebsiteCourse")
public class EduWebsiteCourseController extends BaseController {
	@Autowired
	private EduWebsiteCourseService eduWebsiteCourseService;

	//@RequiresPermissions("system: eduWebsiteCourse:list")
	@PostMapping("/list")
	public TableDataInfo list(EduWebsiteCourse  eduWebsiteCourse) {
		startPage();
		List<EduWebsiteCourse> list = eduWebsiteCourseService.findByList( eduWebsiteCourse);
		return getDataTable(list);
	}

	/*@Log(title = "课程网站链接管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: eduWebsiteCourse:export")
	@GetMapping("/export")
	public AjaxResult export(EduWebsiteCourse  eduWebsiteCourse) {
		List<EduWebsiteCourse> list = eduWebsiteCourseService.findByList( eduWebsiteCourse);
		ExcelUtil<EduWebsiteCourse> util = new ExcelUtil<EduWebsiteCourse>(Role.class);
		return util.exportExcel(list, "课程网站链接数据");
	}*/

	/**
	 * 根据课程网站链接编号获取详细信息
	 */
	//@RequiresPermissions("system: eduWebsiteCourse:query")
	@GetMapping(value = "/{eduWebsiteCourseId}")
	public AjaxResult getInfo(@PathVariable Long  eduWebsiteCourseId) {
		return AjaxResult.success(eduWebsiteCourseService.findById( eduWebsiteCourseId));
	}

	/**
	 * 新增课程网站链接
	 */
	//@RequiresPermissions("system: eduWebsiteCourse:add")
	@Log(title = "课程网站链接管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody EduWebsiteCourse  eduWebsiteCourse) {
		return toAjax(eduWebsiteCourseService.save( eduWebsiteCourse));

	}

	/**
	 * 修改保存课程网站链接
	 */
	//@RequiresPermissions("system: eduWebsiteCourse:edit")
	@Log(title = "课程网站链接管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody EduWebsiteCourse  eduWebsiteCourse) {
		return toAjax(eduWebsiteCourseService.update( eduWebsiteCourse));
	}
	
	
	/**
	 * 删除课程网站链接
	 */
	//@RequiresPermissions("system: eduWebsiteCourse:remove")
	@Log(title = "课程网站链接管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(eduWebsiteCourseService.delByIds(ids));
	}
}