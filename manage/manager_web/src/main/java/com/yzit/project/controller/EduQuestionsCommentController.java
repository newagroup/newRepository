package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.EduQuestionsComment;
import com.yzit.project.service.EduQuestionsCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>问题意见和评论--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/eduQuestionsComment")
public class EduQuestionsCommentController extends BaseController {
	@Autowired
	private EduQuestionsCommentService eduQuestionsCommentService;

	//@RequiresPermissions("system: eduQuestionsComment:list")
	@PostMapping("/list")
	public TableDataInfo list(EduQuestionsComment  eduQuestionsComment) {
		startPage();
		List<EduQuestionsComment> list = eduQuestionsCommentService.findByList( eduQuestionsComment);
		return getDataTable(list);
	}

	/*@Log(title = "问题意见和评论管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: eduQuestionsComment:export")
	@GetMapping("/export")
	public AjaxResult export(EduQuestionsComment  eduQuestionsComment) {
		List<EduQuestionsComment> list = eduQuestionsCommentService.findByList( eduQuestionsComment);
		ExcelUtil<EduQuestionsComment> util = new ExcelUtil<EduQuestionsComment>(Role.class);
		return util.exportExcel(list, "问题意见和评论数据");
	}*/

	/**
	 * 根据问题意见和评论编号获取详细信息
	 */
	//@RequiresPermissions("system: eduQuestionsComment:query")
	@GetMapping(value = "/{eduQuestionsCommentId}")
	public AjaxResult getInfo(@PathVariable Long  eduQuestionsCommentId) {
		return AjaxResult.success(eduQuestionsCommentService.findById( eduQuestionsCommentId));
	}

	/**
	 * 新增问题意见和评论
	 */
	//@RequiresPermissions("system: eduQuestionsComment:add")
	@Log(title = "问题意见和评论管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody EduQuestionsComment  eduQuestionsComment) {
		return toAjax(eduQuestionsCommentService.save( eduQuestionsComment));

	}

	/**
	 * 修改保存问题意见和评论
	 */
	//@RequiresPermissions("system: eduQuestionsComment:edit")
	@Log(title = "问题意见和评论管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody EduQuestionsComment  eduQuestionsComment) {
		return toAjax(eduQuestionsCommentService.update( eduQuestionsComment));
	}
	
	
	/**
	 * 删除问题意见和评论
	 */
	//@RequiresPermissions("system: eduQuestionsComment:remove")
	@Log(title = "问题意见和评论管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(eduQuestionsCommentService.delByIds(ids));
	}
}