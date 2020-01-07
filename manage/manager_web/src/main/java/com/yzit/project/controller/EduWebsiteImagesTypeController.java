package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.EduWebsiteImagesType;
import com.yzit.project.service.EduWebsiteImagesTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>网站链接图片类型--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/eduWebsiteImagesType")
public class EduWebsiteImagesTypeController extends BaseController {
	@Autowired
	private EduWebsiteImagesTypeService eduWebsiteImagesTypeService;

	//@RequiresPermissions("system: eduWebsiteImagesType:list")
	@PostMapping("/list")
	public TableDataInfo list(EduWebsiteImagesType  eduWebsiteImagesType) {
		startPage();
		List<EduWebsiteImagesType> list = eduWebsiteImagesTypeService.findByList( eduWebsiteImagesType);
		return getDataTable(list);
	}

	/*@Log(title = "网站链接图片类型管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: eduWebsiteImagesType:export")
	@GetMapping("/export")
	public AjaxResult export(EduWebsiteImagesType  eduWebsiteImagesType) {
		List<EduWebsiteImagesType> list = eduWebsiteImagesTypeService.findByList( eduWebsiteImagesType);
		ExcelUtil<EduWebsiteImagesType> util = new ExcelUtil<EduWebsiteImagesType>(Role.class);
		return util.exportExcel(list, "网站链接图片类型数据");
	}*/

	/**
	 * 根据网站链接图片类型编号获取详细信息
	 */
	//@RequiresPermissions("system: eduWebsiteImagesType:query")
	@GetMapping(value = "/{eduWebsiteImagesTypeId}")
	public AjaxResult getInfo(@PathVariable Long  eduWebsiteImagesTypeId) {
		return AjaxResult.success(eduWebsiteImagesTypeService.findById( eduWebsiteImagesTypeId));
	}

	/**
	 * 新增网站链接图片类型
	 */
	//@RequiresPermissions("system: eduWebsiteImagesType:add")
	@Log(title = "网站链接图片类型管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody EduWebsiteImagesType  eduWebsiteImagesType) {
		return toAjax(eduWebsiteImagesTypeService.save( eduWebsiteImagesType));

	}

	/**
	 * 修改保存网站链接图片类型
	 */
	//@RequiresPermissions("system: eduWebsiteImagesType:edit")
	@Log(title = "网站链接图片类型管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody EduWebsiteImagesType  eduWebsiteImagesType) {
		return toAjax(eduWebsiteImagesTypeService.update( eduWebsiteImagesType));
	}
	
	
	/**
	 * 删除网站链接图片类型
	 */
	//@RequiresPermissions("system: eduWebsiteImagesType:remove")
	@Log(title = "网站链接图片类型管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(eduWebsiteImagesTypeService.delByIds(ids));
	}
}