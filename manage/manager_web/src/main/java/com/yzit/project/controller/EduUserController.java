package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.EduUser;
import com.yzit.project.service.EduUserService;
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
@RequestMapping("/eduUser")
public class EduUserController extends BaseController {
	@Autowired
	private EduUserService eduUserService;

	//@RequiresPermissions("system: eduUser:list")
	@PostMapping("/list")
	public TableDataInfo list(EduUser  eduUser) {
		startPage();
		List<EduUser> list = eduUserService.findByList( eduUser);
		return getDataTable(list);
	}

	/*@Log(title = "用户表管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: eduUser:export")
	@GetMapping("/export")
	public AjaxResult export(EduUser  eduUser) {
		List<EduUser> list = eduUserService.findByList( eduUser);
		ExcelUtil<EduUser> util = new ExcelUtil<EduUser>(Role.class);
		return util.exportExcel(list, "用户表数据");
	}*/

	/**
	 * 根据用户表编号获取详细信息
	 */
	//@RequiresPermissions("system: eduUser:query")
	@GetMapping(value = "/{eduUserId}")
	public AjaxResult getInfo(@PathVariable Long  eduUserId) {
		return AjaxResult.success(eduUserService.findById( eduUserId));
	}

	/**
	 * 新增用户表
	 */
	//@RequiresPermissions("system: eduUser:add")
	@Log(title = "用户表管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody EduUser  eduUser) {
		return toAjax(eduUserService.save( eduUser));

	}

	/**
	 * 修改保存用户表
	 */
	//@RequiresPermissions("system: eduUser:edit")
	@Log(title = "用户表管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody EduUser  eduUser) {
		return toAjax(eduUserService.update( eduUser));
	}
	
	
	/**
	 * 删除用户表
	 */
	//@RequiresPermissions("system: eduUser:remove")
	@Log(title = "用户表管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(eduUserService.delByIds(ids));
	}
}