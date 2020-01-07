package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.EduArticle;
import com.yzit.project.service.EduArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>文章表--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/eduArticle")
public class EduArticleController extends BaseController {
	@Autowired
	private EduArticleService eduArticleService;

	//@RequiresPermissions("system: eduArticle:list")
	@PostMapping("/list")
	public TableDataInfo list(EduArticle  eduArticle) {
		startPage();
		List<EduArticle> list = eduArticleService.findByList( eduArticle);
		return getDataTable(list);
	}

	/*@Log(title = "文章表管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: eduArticle:export")
	@GetMapping("/export")
	public AjaxResult export(EduArticle  eduArticle) {
		List<EduArticle> list = eduArticleService.findByList( eduArticle);
		ExcelUtil<EduArticle> util = new ExcelUtil<EduArticle>(Role.class);
		return util.exportExcel(list, "文章表数据");
	}*/

	/**
	 * 根据文章表编号获取详细信息
	 */
	//@RequiresPermissions("system: eduArticle:query")
	@GetMapping(value = "/{eduArticleId}")
	public AjaxResult getInfo(@PathVariable Long  eduArticleId) {
		return AjaxResult.success(eduArticleService.findById( eduArticleId));
	}

	/**
	 * 新增文章表
	 */
	//@RequiresPermissions("system: eduArticle:add")
	@Log(title = "文章表管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody EduArticle  eduArticle) {
		return toAjax(eduArticleService.save( eduArticle));

	}

	/**
	 * 修改保存文章表
	 */
	//@RequiresPermissions("system: eduArticle:edit")
	@Log(title = "文章表管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody EduArticle  eduArticle) {
		return toAjax(eduArticleService.update( eduArticle));
	}
	
	
	/**
	 * 删除文章表
	 */
	//@RequiresPermissions("system: eduArticle:remove")
	@Log(title = "文章表管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(eduArticleService.delByIds(ids));
	}
}