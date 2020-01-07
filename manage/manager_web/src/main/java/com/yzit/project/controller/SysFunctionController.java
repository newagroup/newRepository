package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.SysFunction;
import com.yzit.project.service.SysFunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>功能--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/sysFunction")
public class SysFunctionController extends BaseController {
	@Autowired
	private SysFunctionService sysFunctionService;

	//@RequiresPermissions("system: sysFunction:list")
	@PostMapping("/list")
	public TableDataInfo list(SysFunction  sysFunction) {
		startPage();
		List<SysFunction> list = sysFunctionService.findByList( sysFunction);
		return getDataTable(list);
	}

	/*@Log(title = "功能管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: sysFunction:export")
	@GetMapping("/export")
	public AjaxResult export(SysFunction  sysFunction) {
		List<SysFunction> list = sysFunctionService.findByList( sysFunction);
		ExcelUtil<SysFunction> util = new ExcelUtil<SysFunction>(Role.class);
		return util.exportExcel(list, "功能数据");
	}*/

	/**
	 * 根据功能编号获取详细信息
	 */
	//@RequiresPermissions("system: sysFunction:query")
	@GetMapping(value = "/{sysFunctionId}")
	public AjaxResult getInfo(@PathVariable Long  sysFunctionId) {
		return AjaxResult.success(sysFunctionService.findById( sysFunctionId));
	}

	/**
	 * 新增功能
	 */
	//@RequiresPermissions("system: sysFunction:add")
	@Log(title = "功能管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody SysFunction  sysFunction) {
		return toAjax(sysFunctionService.save( sysFunction));

	}

	/**
	 * 修改保存功能
	 */
	//@RequiresPermissions("system: sysFunction:edit")
	@Log(title = "功能管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody SysFunction  sysFunction) {
		return toAjax(sysFunctionService.update( sysFunction));
	}
	
	
	/**
	 * 删除功能
	 */
	//@RequiresPermissions("system: sysFunction:remove")
	@Log(title = "功能管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(sysFunctionService.delByIds(ids));
	}
}