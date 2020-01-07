package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.EduUserLoginLog;
import com.yzit.project.service.EduUserLoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>用户登录日志--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/eduUserLoginLog")
public class EduUserLoginLogController extends BaseController {
	@Autowired
	private EduUserLoginLogService eduUserLoginLogService;

	//@RequiresPermissions("system: eduUserLoginLog:list")
	@PostMapping("/list")
	public TableDataInfo list(EduUserLoginLog  eduUserLoginLog) {
		startPage();
		List<EduUserLoginLog> list = eduUserLoginLogService.findByList( eduUserLoginLog);
		return getDataTable(list);
	}

	/*@Log(title = "用户登录日志管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: eduUserLoginLog:export")
	@GetMapping("/export")
	public AjaxResult export(EduUserLoginLog  eduUserLoginLog) {
		List<EduUserLoginLog> list = eduUserLoginLogService.findByList( eduUserLoginLog);
		ExcelUtil<EduUserLoginLog> util = new ExcelUtil<EduUserLoginLog>(Role.class);
		return util.exportExcel(list, "用户登录日志数据");
	}*/

	/**
	 * 根据用户登录日志编号获取详细信息
	 */
	//@RequiresPermissions("system: eduUserLoginLog:query")
	@GetMapping(value = "/{eduUserLoginLogId}")
	public AjaxResult getInfo(@PathVariable Long  eduUserLoginLogId) {
		return AjaxResult.success(eduUserLoginLogService.findById( eduUserLoginLogId));
	}

	/**
	 * 新增用户登录日志
	 */
	//@RequiresPermissions("system: eduUserLoginLog:add")
	@Log(title = "用户登录日志管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody EduUserLoginLog  eduUserLoginLog) {
		return toAjax(eduUserLoginLogService.save( eduUserLoginLog));

	}

	/**
	 * 修改保存用户登录日志
	 */
	//@RequiresPermissions("system: eduUserLoginLog:edit")
	@Log(title = "用户登录日志管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody EduUserLoginLog  eduUserLoginLog) {
		return toAjax(eduUserLoginLogService.update( eduUserLoginLog));
	}
	
	
	/**
	 * 删除用户登录日志
	 */
	//@RequiresPermissions("system: eduUserLoginLog:remove")
	@Log(title = "用户登录日志管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(eduUserLoginLogService.delByIds(ids));
	}
}