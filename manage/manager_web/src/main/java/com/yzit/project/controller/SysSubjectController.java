package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.SysSubject;
import com.yzit.project.service.SysSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>科目--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/sysSubject")
public class SysSubjectController extends BaseController {
	@Autowired
	private SysSubjectService sysSubjectService;

	//@RequiresPermissions("system: sysSubject:list")
	@PostMapping("/list")
	public TableDataInfo list(SysSubject  sysSubject) {
		startPage();
		List<SysSubject> list = sysSubjectService.findByList( sysSubject);
		return getDataTable(list);
	}

	/*@Log(title = "科目管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: sysSubject:export")
	@GetMapping("/export")
	public AjaxResult export(SysSubject  sysSubject) {
		List<SysSubject> list = sysSubjectService.findByList( sysSubject);
		ExcelUtil<SysSubject> util = new ExcelUtil<SysSubject>(Role.class);
		return util.exportExcel(list, "科目数据");
	}*/

	/**
	 * 根据科目编号获取详细信息
	 */
	//@RequiresPermissions("system: sysSubject:query")
	@GetMapping(value = "/{sysSubjectId}")
	public AjaxResult getInfo(@PathVariable Long  sysSubjectId) {
		return AjaxResult.success(sysSubjectService.findById( sysSubjectId));
	}

	/**
	 * 新增科目
	 */
	//@RequiresPermissions("system: sysSubject:add")
	@Log(title = "科目管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody SysSubject  sysSubject) {
		return toAjax(sysSubjectService.save( sysSubject));

	}

	/**
	 * 修改保存科目
	 */
	//@RequiresPermissions("system: sysSubject:edit")
	@Log(title = "科目管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody SysSubject  sysSubject) {
		return toAjax(sysSubjectService.update( sysSubject));
	}
	
	
	/**
	 * 删除科目
	 */
	//@RequiresPermissions("system: sysSubject:remove")
	@Log(title = "科目管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(sysSubjectService.delByIds(ids));
	}
}