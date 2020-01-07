package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.EduPraise;
import com.yzit.project.service.EduPraiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>赞--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/eduPraise")
public class EduPraiseController extends BaseController {
	@Autowired
	private EduPraiseService eduPraiseService;

	//@RequiresPermissions("system: eduPraise:list")
	@PostMapping("/list")
	public TableDataInfo list(EduPraise  eduPraise) {
		startPage();
		List<EduPraise> list = eduPraiseService.findByList( eduPraise);
		return getDataTable(list);
	}

	/*@Log(title = "赞管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: eduPraise:export")
	@GetMapping("/export")
	public AjaxResult export(EduPraise  eduPraise) {
		List<EduPraise> list = eduPraiseService.findByList( eduPraise);
		ExcelUtil<EduPraise> util = new ExcelUtil<EduPraise>(Role.class);
		return util.exportExcel(list, "赞数据");
	}*/

	/**
	 * 根据赞编号获取详细信息
	 */
	//@RequiresPermissions("system: eduPraise:query")
	@GetMapping(value = "/{eduPraiseId}")
	public AjaxResult getInfo(@PathVariable Long  eduPraiseId) {
		return AjaxResult.success(eduPraiseService.findById( eduPraiseId));
	}

	/**
	 * 新增赞
	 */
	//@RequiresPermissions("system: eduPraise:add")
	@Log(title = "赞管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody EduPraise  eduPraise) {
		return toAjax(eduPraiseService.save( eduPraise));

	}

	/**
	 * 修改保存赞
	 */
	//@RequiresPermissions("system: eduPraise:edit")
	@Log(title = "赞管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody EduPraise  eduPraise) {
		return toAjax(eduPraiseService.update( eduPraise));
	}
	
	
	/**
	 * 删除赞
	 */
	//@RequiresPermissions("system: eduPraise:remove")
	@Log(title = "赞管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(eduPraiseService.delByIds(ids));
	}
}