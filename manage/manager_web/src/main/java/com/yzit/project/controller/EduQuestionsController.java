package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.EduQuestions;
import com.yzit.project.service.EduQuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>问题--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/eduQuestions")
public class EduQuestionsController extends BaseController {
	@Autowired
	private EduQuestionsService eduQuestionsService;

	//@RequiresPermissions("system: eduQuestions:list")
	@PostMapping("/list")
	public TableDataInfo list(EduQuestions  eduQuestions) {
		startPage();
		List<EduQuestions> list = eduQuestionsService.findByList( eduQuestions);
		return getDataTable(list);
	}

	/*@Log(title = "问题管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: eduQuestions:export")
	@GetMapping("/export")
	public AjaxResult export(EduQuestions  eduQuestions) {
		List<EduQuestions> list = eduQuestionsService.findByList( eduQuestions);
		ExcelUtil<EduQuestions> util = new ExcelUtil<EduQuestions>(Role.class);
		return util.exportExcel(list, "问题数据");
	}*/

	/**
	 * 根据问题编号获取详细信息
	 */
	//@RequiresPermissions("system: eduQuestions:query")
	@GetMapping(value = "/{eduQuestionsId}")
	public AjaxResult getInfo(@PathVariable Long  eduQuestionsId) {
		return AjaxResult.success(eduQuestionsService.findById( eduQuestionsId));
	}

	/**
	 * 新增问题
	 */
	//@RequiresPermissions("system: eduQuestions:add")
	@Log(title = "问题管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody EduQuestions  eduQuestions) {
		return toAjax(eduQuestionsService.save( eduQuestions));

	}

	/**
	 * 修改保存问题
	 */
	//@RequiresPermissions("system: eduQuestions:edit")
	@Log(title = "问题管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody EduQuestions  eduQuestions) {
		return toAjax(eduQuestionsService.update( eduQuestions));
	}
	
	
	/**
	 * 删除问题
	 */
	//@RequiresPermissions("system: eduQuestions:remove")
	@Log(title = "问题管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(eduQuestionsService.delByIds(ids));
	}
}