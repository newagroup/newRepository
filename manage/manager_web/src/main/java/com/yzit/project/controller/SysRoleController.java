package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.SysRole;
import com.yzit.project.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>角色--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/sysRole")
public class SysRoleController extends BaseController {
	@Autowired
	private SysRoleService sysRoleService;

	//@RequiresPermissions("system: sysRole:list")
	@PostMapping("/list")
	public TableDataInfo list(SysRole  sysRole) {
		startPage();
		List<SysRole> list = sysRoleService.findByList( sysRole);
		return getDataTable(list);
	}

	/*@Log(title = "角色管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: sysRole:export")
	@GetMapping("/export")
	public AjaxResult export(SysRole  sysRole) {
		List<SysRole> list = sysRoleService.findByList( sysRole);
		ExcelUtil<SysRole> util = new ExcelUtil<SysRole>(Role.class);
		return util.exportExcel(list, "角色数据");
	}*/

	/**
	 * 根据角色编号获取详细信息
	 */
	//@RequiresPermissions("system: sysRole:query")
	@GetMapping(value = "/{sysRoleId}")
	public AjaxResult getInfo(@PathVariable Long  sysRoleId) {
		return AjaxResult.success(sysRoleService.findById( sysRoleId));
	}

	/**
	 * 新增角色
	 */
	//@RequiresPermissions("system: sysRole:add")
	@Log(title = "角色管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody SysRole  sysRole) {
		return toAjax(sysRoleService.save( sysRole));

	}

	/**
	 * 修改保存角色
	 */
	//@RequiresPermissions("system: sysRole:edit")
	@Log(title = "角色管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody SysRole  sysRole) {
		return toAjax(sysRoleService.update( sysRole));
	}
	
	
	/**
	 * 删除角色
	 */
	//@RequiresPermissions("system: sysRole:remove")
	@Log(title = "角色管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(sysRoleService.delByIds(ids));
	}
}