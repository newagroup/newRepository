package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.EduWebsiteNavigate;
import com.yzit.project.service.EduWebsiteNavigateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>网站链接导航--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/eduWebsiteNavigate")
public class EduWebsiteNavigateController extends BaseController {
	@Autowired
	private EduWebsiteNavigateService eduWebsiteNavigateService;

	//@RequiresPermissions("system: eduWebsiteNavigate:list")
	@PostMapping("/list")
	public TableDataInfo list(EduWebsiteNavigate  eduWebsiteNavigate) {
		startPage();
		List<EduWebsiteNavigate> list = eduWebsiteNavigateService.findByList( eduWebsiteNavigate);
		return getDataTable(list);
	}

	/*@Log(title = "网站链接导航管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: eduWebsiteNavigate:export")
	@GetMapping("/export")
	public AjaxResult export(EduWebsiteNavigate  eduWebsiteNavigate) {
		List<EduWebsiteNavigate> list = eduWebsiteNavigateService.findByList( eduWebsiteNavigate);
		ExcelUtil<EduWebsiteNavigate> util = new ExcelUtil<EduWebsiteNavigate>(Role.class);
		return util.exportExcel(list, "网站链接导航数据");
	}*/

	/**
	 * 根据网站链接导航编号获取详细信息
	 */
	//@RequiresPermissions("system: eduWebsiteNavigate:query")
	@GetMapping(value = "/{eduWebsiteNavigateId}")
	public AjaxResult getInfo(@PathVariable Long  eduWebsiteNavigateId) {
		return AjaxResult.success(eduWebsiteNavigateService.findById( eduWebsiteNavigateId));
	}

	/**
	 * 新增网站链接导航
	 */
	//@RequiresPermissions("system: eduWebsiteNavigate:add")
	@Log(title = "网站链接导航管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody EduWebsiteNavigate  eduWebsiteNavigate) {
		return toAjax(eduWebsiteNavigateService.save( eduWebsiteNavigate));

	}

	/**
	 * 修改保存网站链接导航
	 */
	//@RequiresPermissions("system: eduWebsiteNavigate:edit")
	@Log(title = "网站链接导航管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody EduWebsiteNavigate  eduWebsiteNavigate) {
		return toAjax(eduWebsiteNavigateService.update( eduWebsiteNavigate));
	}
	
	
	/**
	 * 删除网站链接导航
	 */
	//@RequiresPermissions("system: eduWebsiteNavigate:remove")
	@Log(title = "网站链接导航管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(eduWebsiteNavigateService.delByIds(ids));
	}
}