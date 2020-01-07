package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.EduQuestionsTag;
import com.yzit.project.service.EduQuestionsTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>问题关于的课程类型--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/eduQuestionsTag")
public class EduQuestionsTagController extends BaseController {
	@Autowired
	private EduQuestionsTagService eduQuestionsTagService;

	//@RequiresPermissions("system: eduQuestionsTag:list")
	@PostMapping("/list")
	public TableDataInfo list(EduQuestionsTag  eduQuestionsTag) {
		startPage();
		List<EduQuestionsTag> list = eduQuestionsTagService.findByList( eduQuestionsTag);
		return getDataTable(list);
	}

	/*@Log(title = "问题关于的课程类型管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: eduQuestionsTag:export")
	@GetMapping("/export")
	public AjaxResult export(EduQuestionsTag  eduQuestionsTag) {
		List<EduQuestionsTag> list = eduQuestionsTagService.findByList( eduQuestionsTag);
		ExcelUtil<EduQuestionsTag> util = new ExcelUtil<EduQuestionsTag>(Role.class);
		return util.exportExcel(list, "问题关于的课程类型数据");
	}*/

	/**
	 * 根据问题关于的课程类型编号获取详细信息
	 */
	//@RequiresPermissions("system: eduQuestionsTag:query")
	@GetMapping(value = "/{eduQuestionsTagId}")
	public AjaxResult getInfo(@PathVariable Long  eduQuestionsTagId) {
		return AjaxResult.success(eduQuestionsTagService.findById( eduQuestionsTagId));
	}

	/**
	 * 新增问题关于的课程类型
	 */
	//@RequiresPermissions("system: eduQuestionsTag:add")
	@Log(title = "问题关于的课程类型管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody EduQuestionsTag  eduQuestionsTag) {
		return toAjax(eduQuestionsTagService.save( eduQuestionsTag));

	}

	/**
	 * 修改保存问题关于的课程类型
	 */
	//@RequiresPermissions("system: eduQuestionsTag:edit")
	@Log(title = "问题关于的课程类型管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody EduQuestionsTag  eduQuestionsTag) {
		return toAjax(eduQuestionsTagService.update( eduQuestionsTag));
	}
	
	
	/**
	 * 删除问题关于的课程类型
	 */
	//@RequiresPermissions("system: eduQuestionsTag:remove")
	@Log(title = "问题关于的课程类型管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(eduQuestionsTagService.delByIds(ids));
	}
}