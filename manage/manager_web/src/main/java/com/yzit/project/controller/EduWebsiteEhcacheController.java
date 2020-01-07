package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.EduWebsiteEhcache;
import com.yzit.project.service.EduWebsiteEhcacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>纯Java的进程内缓存框架的描述--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/eduWebsiteEhcache")
public class EduWebsiteEhcacheController extends BaseController {
	@Autowired
	private EduWebsiteEhcacheService eduWebsiteEhcacheService;

	//@RequiresPermissions("system: eduWebsiteEhcache:list")
	@PostMapping("/list")
	public TableDataInfo list(EduWebsiteEhcache  eduWebsiteEhcache) {
		startPage();
		List<EduWebsiteEhcache> list = eduWebsiteEhcacheService.findByList( eduWebsiteEhcache);
		return getDataTable(list);
	}

	/*@Log(title = "纯Java的进程内缓存框架的描述管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: eduWebsiteEhcache:export")
	@GetMapping("/export")
	public AjaxResult export(EduWebsiteEhcache  eduWebsiteEhcache) {
		List<EduWebsiteEhcache> list = eduWebsiteEhcacheService.findByList( eduWebsiteEhcache);
		ExcelUtil<EduWebsiteEhcache> util = new ExcelUtil<EduWebsiteEhcache>(Role.class);
		return util.exportExcel(list, "纯Java的进程内缓存框架的描述数据");
	}*/

	/**
	 * 根据纯Java的进程内缓存框架的描述编号获取详细信息
	 */
	//@RequiresPermissions("system: eduWebsiteEhcache:query")
	@GetMapping(value = "/{eduWebsiteEhcacheId}")
	public AjaxResult getInfo(@PathVariable Long  eduWebsiteEhcacheId) {
		return AjaxResult.success(eduWebsiteEhcacheService.findById( eduWebsiteEhcacheId));
	}

	/**
	 * 新增纯Java的进程内缓存框架的描述
	 */
	//@RequiresPermissions("system: eduWebsiteEhcache:add")
	@Log(title = "纯Java的进程内缓存框架的描述管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody EduWebsiteEhcache  eduWebsiteEhcache) {
		return toAjax(eduWebsiteEhcacheService.save( eduWebsiteEhcache));

	}

	/**
	 * 修改保存纯Java的进程内缓存框架的描述
	 */
	//@RequiresPermissions("system: eduWebsiteEhcache:edit")
	@Log(title = "纯Java的进程内缓存框架的描述管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody EduWebsiteEhcache  eduWebsiteEhcache) {
		return toAjax(eduWebsiteEhcacheService.update( eduWebsiteEhcache));
	}
	
	
	/**
	 * 删除纯Java的进程内缓存框架的描述
	 */
	//@RequiresPermissions("system: eduWebsiteEhcache:remove")
	@Log(title = "纯Java的进程内缓存框架的描述管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(eduWebsiteEhcacheService.delByIds(ids));
	}
}