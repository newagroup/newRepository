package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.EduMsgReceive;
import com.yzit.project.service.EduMsgReceiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>接受的短信--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/eduMsgReceive")
public class EduMsgReceiveController extends BaseController {
	@Autowired
	private EduMsgReceiveService eduMsgReceiveService;

	//@RequiresPermissions("system: eduMsgReceive:list")
	@PostMapping("/list")
	public TableDataInfo list(EduMsgReceive  eduMsgReceive) {
		startPage();
		List<EduMsgReceive> list = eduMsgReceiveService.findByList( eduMsgReceive);
		return getDataTable(list);
	}

	/*@Log(title = "接受的短信管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: eduMsgReceive:export")
	@GetMapping("/export")
	public AjaxResult export(EduMsgReceive  eduMsgReceive) {
		List<EduMsgReceive> list = eduMsgReceiveService.findByList( eduMsgReceive);
		ExcelUtil<EduMsgReceive> util = new ExcelUtil<EduMsgReceive>(Role.class);
		return util.exportExcel(list, "接受的短信数据");
	}*/

	/**
	 * 根据接受的短信编号获取详细信息
	 */
	//@RequiresPermissions("system: eduMsgReceive:query")
	@GetMapping(value = "/{eduMsgReceiveId}")
	public AjaxResult getInfo(@PathVariable Long  eduMsgReceiveId) {
		return AjaxResult.success(eduMsgReceiveService.findById( eduMsgReceiveId));
	}

	/**
	 * 新增接受的短信
	 */
	//@RequiresPermissions("system: eduMsgReceive:add")
	@Log(title = "接受的短信管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody EduMsgReceive  eduMsgReceive) {
		return toAjax(eduMsgReceiveService.save( eduMsgReceive));

	}

	/**
	 * 修改保存接受的短信
	 */
	//@RequiresPermissions("system: eduMsgReceive:edit")
	@Log(title = "接受的短信管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody EduMsgReceive  eduMsgReceive) {
		return toAjax(eduMsgReceiveService.update( eduMsgReceive));
	}
	
	
	/**
	 * 删除接受的短信
	 */
	//@RequiresPermissions("system: eduMsgReceive:remove")
	@Log(title = "接受的短信管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(eduMsgReceiveService.delByIds(ids));
	}
}