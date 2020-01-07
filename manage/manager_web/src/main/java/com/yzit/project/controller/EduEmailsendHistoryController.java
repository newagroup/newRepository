package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.EduEmailsendHistory;
import com.yzit.project.service.EduEmailsendHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>电子邮件记录--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/eduEmailsendHistory")
public class EduEmailsendHistoryController extends BaseController {
	@Autowired
	private EduEmailsendHistoryService eduEmailsendHistoryService;

	//@RequiresPermissions("system: eduEmailsendHistory:list")
	@PostMapping("/list")
	public TableDataInfo list(EduEmailsendHistory  eduEmailsendHistory) {
		startPage();
		List<EduEmailsendHistory> list = eduEmailsendHistoryService.findByList( eduEmailsendHistory);
		return getDataTable(list);
	}

	/*@Log(title = "电子邮件记录管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: eduEmailsendHistory:export")
	@GetMapping("/export")
	public AjaxResult export(EduEmailsendHistory  eduEmailsendHistory) {
		List<EduEmailsendHistory> list = eduEmailsendHistoryService.findByList( eduEmailsendHistory);
		ExcelUtil<EduEmailsendHistory> util = new ExcelUtil<EduEmailsendHistory>(Role.class);
		return util.exportExcel(list, "电子邮件记录数据");
	}*/

	/**
	 * 根据电子邮件记录编号获取详细信息
	 */
	//@RequiresPermissions("system: eduEmailsendHistory:query")
	@GetMapping(value = "/{eduEmailsendHistoryId}")
	public AjaxResult getInfo(@PathVariable Long  eduEmailsendHistoryId) {
		return AjaxResult.success(eduEmailsendHistoryService.findById( eduEmailsendHistoryId));
	}

	/**
	 * 新增电子邮件记录
	 */
	//@RequiresPermissions("system: eduEmailsendHistory:add")
	@Log(title = "电子邮件记录管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody EduEmailsendHistory  eduEmailsendHistory) {
		return toAjax(eduEmailsendHistoryService.save( eduEmailsendHistory));

	}

	/**
	 * 修改保存电子邮件记录
	 */
	//@RequiresPermissions("system: eduEmailsendHistory:edit")
	@Log(title = "电子邮件记录管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody EduEmailsendHistory  eduEmailsendHistory) {
		return toAjax(eduEmailsendHistoryService.update( eduEmailsendHistory));
	}
	
	
	/**
	 * 删除电子邮件记录
	 */
	//@RequiresPermissions("system: eduEmailsendHistory:remove")
	@Log(title = "电子邮件记录管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(eduEmailsendHistoryService.delByIds(ids));
	}
}