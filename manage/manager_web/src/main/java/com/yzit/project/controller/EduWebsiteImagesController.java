package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.EduWebsiteImages;
import com.yzit.project.service.EduWebsiteImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>网站链接图片--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/eduWebsiteImages")
public class EduWebsiteImagesController extends BaseController {
	@Autowired
	private EduWebsiteImagesService eduWebsiteImagesService;

	//@RequiresPermissions("system: eduWebsiteImages:list")
	@PostMapping("/list")
	public TableDataInfo list(EduWebsiteImages  eduWebsiteImages) {
		startPage();
		List<EduWebsiteImages> list = eduWebsiteImagesService.findByList( eduWebsiteImages);
		return getDataTable(list);
	}

	/*@Log(title = "网站链接图片管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: eduWebsiteImages:export")
	@GetMapping("/export")
	public AjaxResult export(EduWebsiteImages  eduWebsiteImages) {
		List<EduWebsiteImages> list = eduWebsiteImagesService.findByList( eduWebsiteImages);
		ExcelUtil<EduWebsiteImages> util = new ExcelUtil<EduWebsiteImages>(Role.class);
		return util.exportExcel(list, "网站链接图片数据");
	}*/

	/**
	 * 根据网站链接图片编号获取详细信息
	 */
	//@RequiresPermissions("system: eduWebsiteImages:query")
	@GetMapping(value = "/{eduWebsiteImagesId}")
	public AjaxResult getInfo(@PathVariable Long  eduWebsiteImagesId) {
		return AjaxResult.success(eduWebsiteImagesService.findById( eduWebsiteImagesId));
	}

	/**
	 * 新增网站链接图片
	 */
	//@RequiresPermissions("system: eduWebsiteImages:add")
	@Log(title = "网站链接图片管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody EduWebsiteImages  eduWebsiteImages) {
		return toAjax(eduWebsiteImagesService.save( eduWebsiteImages));

	}

	/**
	 * 修改保存网站链接图片
	 */
	//@RequiresPermissions("system: eduWebsiteImages:edit")
	@Log(title = "网站链接图片管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody EduWebsiteImages  eduWebsiteImages) {
		return toAjax(eduWebsiteImagesService.update( eduWebsiteImages));
	}
	
	
	/**
	 * 删除网站链接图片
	 */
	//@RequiresPermissions("system: eduWebsiteImages:remove")
	@Log(title = "网站链接图片管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(eduWebsiteImagesService.delByIds(ids));
	}
}