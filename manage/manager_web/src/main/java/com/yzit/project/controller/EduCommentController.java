package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.EduComment;
import com.yzit.project.service.EduCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>文章评论表--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/eduComment")
public class EduCommentController extends BaseController {
	@Autowired
	private EduCommentService eduCommentService;

	//@RequiresPermissions("system: eduComment:list")
	@PostMapping("/list")
	public TableDataInfo list(EduComment  eduComment) {
		startPage();
		List<EduComment> list = eduCommentService.findByList( eduComment);
		return getDataTable(list);
	}

	/*@Log(title = "文章评论表管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: eduComment:export")
	@GetMapping("/export")
	public AjaxResult export(EduComment  eduComment) {
		List<EduComment> list = eduCommentService.findByList( eduComment);
		ExcelUtil<EduComment> util = new ExcelUtil<EduComment>(Role.class);
		return util.exportExcel(list, "文章评论表数据");
	}*/

	/**
	 * 根据文章评论表编号获取详细信息
	 */
	//@RequiresPermissions("system: eduComment:query")
	@GetMapping(value = "/{eduCommentId}")
	public AjaxResult getInfo(@PathVariable Long  eduCommentId) {
		return AjaxResult.success(eduCommentService.findById( eduCommentId));
	}

	/**
	 * 新增文章评论表
	 */
	//@RequiresPermissions("system: eduComment:add")
	@Log(title = "文章评论表管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody EduComment  eduComment) {
		return toAjax(eduCommentService.save( eduComment));

	}

	/**
	 * 修改保存文章评论表
	 */
	//@RequiresPermissions("system: eduComment:edit")
	@Log(title = "文章评论表管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody EduComment  eduComment) {
		return toAjax(eduCommentService.update( eduComment));
	}
	
	
	/**
	 * 删除文章评论表
	 */
	//@RequiresPermissions("system: eduComment:remove")
	@Log(title = "文章评论表管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(eduCommentService.delByIds(ids));
	}
}