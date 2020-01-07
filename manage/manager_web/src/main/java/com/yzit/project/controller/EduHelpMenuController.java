package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.EduHelpMenu;
import com.yzit.project.service.EduHelpMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>帮助菜单--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/eduHelpMenu")
public class EduHelpMenuController extends BaseController {
	@Autowired
	private EduHelpMenuService eduHelpMenuService;

	//@RequiresPermissions("system: eduHelpMenu:list")
	@PostMapping("/list")
	public TableDataInfo list(EduHelpMenu  eduHelpMenu) {
		startPage();
		List<EduHelpMenu> list = eduHelpMenuService.findByList( eduHelpMenu);
		return getDataTable(list);
	}

	/*@Log(title = "帮助菜单管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: eduHelpMenu:export")
	@GetMapping("/export")
	public AjaxResult export(EduHelpMenu  eduHelpMenu) {
		List<EduHelpMenu> list = eduHelpMenuService.findByList( eduHelpMenu);
		ExcelUtil<EduHelpMenu> util = new ExcelUtil<EduHelpMenu>(Role.class);
		return util.exportExcel(list, "帮助菜单数据");
	}*/

	/**
	 * 根据帮助菜单编号获取详细信息
	 */
	//@RequiresPermissions("system: eduHelpMenu:query")
	@GetMapping(value = "/{eduHelpMenuId}")
	public AjaxResult getInfo(@PathVariable Long  eduHelpMenuId) {
		return AjaxResult.success(eduHelpMenuService.findById( eduHelpMenuId));
	}

	/**
	 * 新增帮助菜单
	 */
	//@RequiresPermissions("system: eduHelpMenu:add")
	@Log(title = "帮助菜单管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody EduHelpMenu  eduHelpMenu) {
		return toAjax(eduHelpMenuService.save( eduHelpMenu));

	}

	/**
	 * 修改保存帮助菜单
	 */
	//@RequiresPermissions("system: eduHelpMenu:edit")
	@Log(title = "帮助菜单管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody EduHelpMenu  eduHelpMenu) {
		return toAjax(eduHelpMenuService.update( eduHelpMenu));
	}
	
	
	/**
	 * 删除帮助菜单
	 */
	//@RequiresPermissions("system: eduHelpMenu:remove")
	@Log(title = "帮助菜单管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(eduHelpMenuService.delByIds(ids));
	}
}