package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.EduMsgSystem;
import com.yzit.project.service.EduMsgSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>短信制度--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/eduMsgSystem")
public class EduMsgSystemController extends BaseController {
	@Autowired
	private EduMsgSystemService eduMsgSystemService;

	//@RequiresPermissions("system: eduMsgSystem:list")
	@PostMapping("/list")
	public TableDataInfo list(EduMsgSystem  eduMsgSystem) {
		startPage();
		List<EduMsgSystem> list = eduMsgSystemService.findByList( eduMsgSystem);
		return getDataTable(list);
	}

	/*@Log(title = "短信制度管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: eduMsgSystem:export")
	@GetMapping("/export")
	public AjaxResult export(EduMsgSystem  eduMsgSystem) {
		List<EduMsgSystem> list = eduMsgSystemService.findByList( eduMsgSystem);
		ExcelUtil<EduMsgSystem> util = new ExcelUtil<EduMsgSystem>(Role.class);
		return util.exportExcel(list, "短信制度数据");
	}*/

	/**
	 * 根据短信制度编号获取详细信息
	 */
	//@RequiresPermissions("system: eduMsgSystem:query")
	@GetMapping(value = "/{eduMsgSystemId}")
	public AjaxResult getInfo(@PathVariable Long  eduMsgSystemId) {
		return AjaxResult.success(eduMsgSystemService.findById( eduMsgSystemId));
	}

	/**
	 * 新增短信制度
	 */
	//@RequiresPermissions("system: eduMsgSystem:add")
	@Log(title = "短信制度管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody EduMsgSystem  eduMsgSystem) {
		return toAjax(eduMsgSystemService.save( eduMsgSystem));

	}

	/**
	 * 修改保存短信制度
	 */
	//@RequiresPermissions("system: eduMsgSystem:edit")
	@Log(title = "短信制度管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody EduMsgSystem  eduMsgSystem) {
		return toAjax(eduMsgSystemService.update( eduMsgSystem));
	}
	
	
	/**
	 * 删除短信制度
	 */
	//@RequiresPermissions("system: eduMsgSystem:remove")
	@Log(title = "短信制度管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(eduMsgSystemService.delByIds(ids));
	}
}