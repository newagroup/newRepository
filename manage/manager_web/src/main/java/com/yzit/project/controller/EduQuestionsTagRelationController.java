package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.EduQuestionsTagRelation;
import com.yzit.project.service.EduQuestionsTagRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>问题和问题类型中间表--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/eduQuestionsTagRelation")
public class EduQuestionsTagRelationController extends BaseController {
	@Autowired
	private EduQuestionsTagRelationService eduQuestionsTagRelationService;

	//@RequiresPermissions("system: eduQuestionsTagRelation:list")
	@PostMapping("/list")
	public TableDataInfo list(EduQuestionsTagRelation  eduQuestionsTagRelation) {
		startPage();
		List<EduQuestionsTagRelation> list = eduQuestionsTagRelationService.findByList( eduQuestionsTagRelation);
		return getDataTable(list);
	}

	/*@Log(title = "问题和问题类型中间表管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: eduQuestionsTagRelation:export")
	@GetMapping("/export")
	public AjaxResult export(EduQuestionsTagRelation  eduQuestionsTagRelation) {
		List<EduQuestionsTagRelation> list = eduQuestionsTagRelationService.findByList( eduQuestionsTagRelation);
		ExcelUtil<EduQuestionsTagRelation> util = new ExcelUtil<EduQuestionsTagRelation>(Role.class);
		return util.exportExcel(list, "问题和问题类型中间表数据");
	}*/

	/**
	 * 根据问题和问题类型中间表编号获取详细信息
	 */
	//@RequiresPermissions("system: eduQuestionsTagRelation:query")
	@GetMapping(value = "/{eduQuestionsTagRelationId}")
	public AjaxResult getInfo(@PathVariable Long  eduQuestionsTagRelationId) {
		return AjaxResult.success(eduQuestionsTagRelationService.findById( eduQuestionsTagRelationId));
	}

	/**
	 * 新增问题和问题类型中间表
	 */
	//@RequiresPermissions("system: eduQuestionsTagRelation:add")
	@Log(title = "问题和问题类型中间表管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody EduQuestionsTagRelation  eduQuestionsTagRelation) {
		return toAjax(eduQuestionsTagRelationService.save( eduQuestionsTagRelation));

	}

	/**
	 * 修改保存问题和问题类型中间表
	 */
	//@RequiresPermissions("system: eduQuestionsTagRelation:edit")
	@Log(title = "问题和问题类型中间表管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody EduQuestionsTagRelation  eduQuestionsTagRelation) {
		return toAjax(eduQuestionsTagRelationService.update( eduQuestionsTagRelation));
	}
	
	
	/**
	 * 删除问题和问题类型中间表
	 */
	//@RequiresPermissions("system: eduQuestionsTagRelation:remove")
	@Log(title = "问题和问题类型中间表管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(eduQuestionsTagRelationService.delByIds(ids));
	}
}