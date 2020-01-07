package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.EduCourseFavorites;
import com.yzit.project.service.EduCourseFavoritesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>收藏课程--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/eduCourseFavorites")
public class EduCourseFavoritesController extends BaseController {
	@Autowired
	private EduCourseFavoritesService eduCourseFavoritesService;

	//@RequiresPermissions("system: eduCourseFavorites:list")
	@PostMapping("/list")
	public TableDataInfo list(EduCourseFavorites  eduCourseFavorites) {
		startPage();
		List<EduCourseFavorites> list = eduCourseFavoritesService.findByList( eduCourseFavorites);
		return getDataTable(list);
	}

	/*@Log(title = "收藏课程管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: eduCourseFavorites:export")
	@GetMapping("/export")
	public AjaxResult export(EduCourseFavorites  eduCourseFavorites) {
		List<EduCourseFavorites> list = eduCourseFavoritesService.findByList( eduCourseFavorites);
		ExcelUtil<EduCourseFavorites> util = new ExcelUtil<EduCourseFavorites>(Role.class);
		return util.exportExcel(list, "收藏课程数据");
	}*/

	/**
	 * 根据收藏课程编号获取详细信息
	 */
	//@RequiresPermissions("system: eduCourseFavorites:query")
	@GetMapping(value = "/{eduCourseFavoritesId}")
	public AjaxResult getInfo(@PathVariable Long  eduCourseFavoritesId) {
		return AjaxResult.success(eduCourseFavoritesService.findById( eduCourseFavoritesId));
	}

	/**
	 * 新增收藏课程
	 */
	//@RequiresPermissions("system: eduCourseFavorites:add")
	@Log(title = "收藏课程管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody EduCourseFavorites  eduCourseFavorites) {
		return toAjax(eduCourseFavoritesService.save( eduCourseFavorites));

	}

	/**
	 * 修改保存收藏课程
	 */
	//@RequiresPermissions("system: eduCourseFavorites:edit")
	@Log(title = "收藏课程管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody EduCourseFavorites  eduCourseFavorites) {
		return toAjax(eduCourseFavoritesService.update( eduCourseFavorites));
	}
	
	
	/**
	 * 删除收藏课程
	 */
	//@RequiresPermissions("system: eduCourseFavorites:remove")
	@Log(title = "收藏课程管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(eduCourseFavoritesService.delByIds(ids));
	}
}