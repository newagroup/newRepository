package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.EduWebsiteCourseDetail;
import com.yzit.project.service.EduWebsiteCourseDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>课程网站链接细节--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/eduWebsiteCourseDetail")
public class EduWebsiteCourseDetailController extends BaseController {
	@Autowired
	private EduWebsiteCourseDetailService eduWebsiteCourseDetailService;

	//@RequiresPermissions("system: eduWebsiteCourseDetail:list")
	@PostMapping("/list")
	public TableDataInfo list(EduWebsiteCourseDetail  eduWebsiteCourseDetail) {
		startPage();
		List<EduWebsiteCourseDetail> list = eduWebsiteCourseDetailService.findByList( eduWebsiteCourseDetail);
		return getDataTable(list);
	}

	/*@Log(title = "课程网站链接细节管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: eduWebsiteCourseDetail:export")
	@GetMapping("/export")
	public AjaxResult export(EduWebsiteCourseDetail  eduWebsiteCourseDetail) {
		List<EduWebsiteCourseDetail> list = eduWebsiteCourseDetailService.findByList( eduWebsiteCourseDetail);
		ExcelUtil<EduWebsiteCourseDetail> util = new ExcelUtil<EduWebsiteCourseDetail>(Role.class);
		return util.exportExcel(list, "课程网站链接细节数据");
	}*/

	/**
	 * 根据课程网站链接细节编号获取详细信息
	 */
	//@RequiresPermissions("system: eduWebsiteCourseDetail:query")
	@GetMapping(value = "/{eduWebsiteCourseDetailId}")
	public AjaxResult getInfo(@PathVariable Long  eduWebsiteCourseDetailId) {
		return AjaxResult.success(eduWebsiteCourseDetailService.findById( eduWebsiteCourseDetailId));
	}

	/**
	 * 新增课程网站链接细节
	 */
	//@RequiresPermissions("system: eduWebsiteCourseDetail:add")
	@Log(title = "课程网站链接细节管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody EduWebsiteCourseDetail  eduWebsiteCourseDetail) {
		return toAjax(eduWebsiteCourseDetailService.save( eduWebsiteCourseDetail));

	}

	/**
	 * 修改保存课程网站链接细节
	 */
	//@RequiresPermissions("system: eduWebsiteCourseDetail:edit")
	@Log(title = "课程网站链接细节管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody EduWebsiteCourseDetail  eduWebsiteCourseDetail) {
		return toAjax(eduWebsiteCourseDetailService.update( eduWebsiteCourseDetail));
	}
	
	
	/**
	 * 删除课程网站链接细节
	 */
	//@RequiresPermissions("system: eduWebsiteCourseDetail:remove")
	@Log(title = "课程网站链接细节管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(eduWebsiteCourseDetailService.delByIds(ids));
	}
}