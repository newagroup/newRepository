package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.SysLoginLog;
import com.yzit.project.service.SysLoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b> 登录日志--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/sysLoginLog")
public class SysLoginLogController extends BaseController {
	@Autowired
	private SysLoginLogService sysLoginLogService;

	//@RequiresPermissions("system: sysLoginLog:list")
	@PostMapping("/list")
	public TableDataInfo list(SysLoginLog  sysLoginLog) {
		startPage();
		List<SysLoginLog> list = sysLoginLogService.findByList( sysLoginLog);
		return getDataTable(list);
	}

	/*@Log(title = " 登录日志管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: sysLoginLog:export")
	@GetMapping("/export")
	public AjaxResult export(SysLoginLog  sysLoginLog) {
		List<SysLoginLog> list = sysLoginLogService.findByList( sysLoginLog);
		ExcelUtil<SysLoginLog> util = new ExcelUtil<SysLoginLog>(Role.class);
		return util.exportExcel(list, " 登录日志数据");
	}*/

	/**
	 * 根据 登录日志编号获取详细信息
	 */
	//@RequiresPermissions("system: sysLoginLog:query")
	@GetMapping(value = "/{sysLoginLogId}")
	public AjaxResult getInfo(@PathVariable Long  sysLoginLogId) {
		return AjaxResult.success(sysLoginLogService.findById( sysLoginLogId));
	}

	/**
	 * 新增 登录日志
	 */
	//@RequiresPermissions("system: sysLoginLog:add")
	@Log(title = " 登录日志管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody SysLoginLog  sysLoginLog) {
		return toAjax(sysLoginLogService.save( sysLoginLog));

	}

	/**
	 * 修改保存 登录日志
	 */
	//@RequiresPermissions("system: sysLoginLog:edit")
	@Log(title = " 登录日志管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody SysLoginLog  sysLoginLog) {
		return toAjax(sysLoginLogService.update( sysLoginLog));
	}
	
	
	/**
	 * 删除 登录日志
	 */
	//@RequiresPermissions("system: sysLoginLog:remove")
	@Log(title = " 登录日志管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(sysLoginLogService.delByIds(ids));
	}
}