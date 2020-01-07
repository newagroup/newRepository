package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.EduCourseKpoint;
import com.yzit.project.service.EduCourseKpointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>课程章节--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/eduCourseKpoint")
public class EduCourseKpointController extends BaseController {
	@Autowired
	private EduCourseKpointService eduCourseKpointService;

	//@RequiresPermissions("system: eduCourseKpoint:list")
	@PostMapping("/list")
	public TableDataInfo list(EduCourseKpoint  eduCourseKpoint) {
		startPage();
		List<EduCourseKpoint> list = eduCourseKpointService.findByList( eduCourseKpoint);
		return getDataTable(list);
	}

	/*@Log(title = "课程章节管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: eduCourseKpoint:export")
	@GetMapping("/export")
	public AjaxResult export(EduCourseKpoint  eduCourseKpoint) {
		List<EduCourseKpoint> list = eduCourseKpointService.findByList( eduCourseKpoint);
		ExcelUtil<EduCourseKpoint> util = new ExcelUtil<EduCourseKpoint>(Role.class);
		return util.exportExcel(list, "课程章节数据");
	}*/

	/**
	 * 根据课程章节编号获取详细信息
	 */
	//@RequiresPermissions("system: eduCourseKpoint:query")
	@GetMapping(value = "/{eduCourseKpointId}")
	public AjaxResult getInfo(@PathVariable Long  eduCourseKpointId) {
		return AjaxResult.success(eduCourseKpointService.findById( eduCourseKpointId));
	}

	/**
	 * 新增课程章节
	 */
	//@RequiresPermissions("system: eduCourseKpoint:add")
	@Log(title = "课程章节管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody EduCourseKpoint  eduCourseKpoint) {
		return toAjax(eduCourseKpointService.save( eduCourseKpoint));

	}

	/**
	 * 修改保存课程章节
	 */
	//@RequiresPermissions("system: eduCourseKpoint:edit")
	@Log(title = "课程章节管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody EduCourseKpoint  eduCourseKpoint) {
		return toAjax(eduCourseKpointService.update( eduCourseKpoint));
	}
	
	
	/**
	 * 删除课程章节
	 */
	//@RequiresPermissions("system: eduCourseKpoint:remove")
	@Log(title = "课程章节管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(eduCourseKpointService.delByIds(ids));
	}
}