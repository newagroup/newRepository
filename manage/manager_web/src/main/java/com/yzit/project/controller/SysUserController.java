package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.SysUser;
import com.yzit.project.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>用户表--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/sysUser")
public class SysUserController extends BaseController {
	@Autowired
	private SysUserService sysUserService;

	//@RequiresPermissions("system: sysUser:list")
	@PostMapping("/list")
	public TableDataInfo list(SysUser  sysUser) {
		startPage();
		List<SysUser> list = sysUserService.findByList( sysUser);
		return getDataTable(list);
	}

	/*@Log(title = "用户表管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: sysUser:export")
	@GetMapping("/export")
	public AjaxResult export(SysUser  sysUser) {
		List<SysUser> list = sysUserService.findByList( sysUser);
		ExcelUtil<SysUser> util = new ExcelUtil<SysUser>(Role.class);
		return util.exportExcel(list, "用户表数据");
	}*/

	/**
	 * 根据用户表编号获取详细信息
	 */
	//@RequiresPermissions("system: sysUser:query")
	@GetMapping(value = "/{sysUserId}")
	public AjaxResult getInfo(@PathVariable Long  sysUserId) {
		return AjaxResult.success(sysUserService.findById( sysUserId));
	}

	/**
	 * 新增用户表
	 */
	//@RequiresPermissions("system: sysUser:add")
	@Log(title = "用户表管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody SysUser  sysUser) {
		return toAjax(sysUserService.save( sysUser));

	}

	/**
	 * 修改保存用户表
	 */
	//@RequiresPermissions("system: sysUser:edit")
	@Log(title = "用户表管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody SysUser  sysUser) {
		return toAjax(sysUserService.update( sysUser));
	}
	
	
	/**
	 * 删除用户表
	 */
	//@RequiresPermissions("system: sysUser:remove")
	@Log(title = "用户表管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(sysUserService.delByIds(ids));
	}
}