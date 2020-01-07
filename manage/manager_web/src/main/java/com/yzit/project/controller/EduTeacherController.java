package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.EduTeacher;
import com.yzit.project.service.EduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>教师表--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/eduTeacher")
public class EduTeacherController extends BaseController {
	@Autowired
	private EduTeacherService eduTeacherService;

	//@RequiresPermissions("system: eduTeacher:list")
	@PostMapping("/list")
	public TableDataInfo list(EduTeacher  eduTeacher) {
		startPage();
		List<EduTeacher> list = eduTeacherService.findByList( eduTeacher);
		return getDataTable(list);
	}

	/*@Log(title = "教师表管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: eduTeacher:export")
	@GetMapping("/export")
	public AjaxResult export(EduTeacher  eduTeacher) {
		List<EduTeacher> list = eduTeacherService.findByList( eduTeacher);
		ExcelUtil<EduTeacher> util = new ExcelUtil<EduTeacher>(Role.class);
		return util.exportExcel(list, "教师表数据");
	}*/

	/**
	 * 根据教师表编号获取详细信息
	 */
	//@RequiresPermissions("system: eduTeacher:query")
	@GetMapping(value = "/{eduTeacherId}")
	public AjaxResult getInfo(@PathVariable Long  eduTeacherId) {
		return AjaxResult.success(eduTeacherService.findById( eduTeacherId));
	}

	/**
	 * 新增教师表
	 */
	//@RequiresPermissions("system: eduTeacher:add")
	@Log(title = "教师表管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody EduTeacher  eduTeacher) {
		return toAjax(eduTeacherService.save( eduTeacher));

	}

	/**
	 * 修改保存教师表
	 */
	//@RequiresPermissions("system: eduTeacher:edit")
	@Log(title = "教师表管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody EduTeacher  eduTeacher) {
		return toAjax(eduTeacherService.update( eduTeacher));
	}
	
	
	/**
	 * 删除教师表
	 */
	//@RequiresPermissions("system: eduTeacher:remove")
	@Log(title = "教师表管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(eduTeacherService.delByIds(ids));
	}
}