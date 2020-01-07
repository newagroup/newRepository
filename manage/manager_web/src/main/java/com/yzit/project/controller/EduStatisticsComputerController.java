package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.EduStatisticsComputer;
import com.yzit.project.service.EduStatisticsComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>电脑统计--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/eduStatisticsComputer")
public class EduStatisticsComputerController extends BaseController {
	@Autowired
	private EduStatisticsComputerService eduStatisticsComputerService;

	//@RequiresPermissions("system: eduStatisticsComputer:list")
	@PostMapping("/list")
	public TableDataInfo list(EduStatisticsComputer  eduStatisticsComputer) {
		startPage();
		List<EduStatisticsComputer> list = eduStatisticsComputerService.findByList( eduStatisticsComputer);
		return getDataTable(list);
	}

	/*@Log(title = "电脑统计管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: eduStatisticsComputer:export")
	@GetMapping("/export")
	public AjaxResult export(EduStatisticsComputer  eduStatisticsComputer) {
		List<EduStatisticsComputer> list = eduStatisticsComputerService.findByList( eduStatisticsComputer);
		ExcelUtil<EduStatisticsComputer> util = new ExcelUtil<EduStatisticsComputer>(Role.class);
		return util.exportExcel(list, "电脑统计数据");
	}*/

	/**
	 * 根据电脑统计编号获取详细信息
	 */
	//@RequiresPermissions("system: eduStatisticsComputer:query")
	@GetMapping(value = "/{eduStatisticsComputerId}")
	public AjaxResult getInfo(@PathVariable Long  eduStatisticsComputerId) {
		return AjaxResult.success(eduStatisticsComputerService.findById( eduStatisticsComputerId));
	}

	/**
	 * 新增电脑统计
	 */
	//@RequiresPermissions("system: eduStatisticsComputer:add")
	@Log(title = "电脑统计管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody EduStatisticsComputer  eduStatisticsComputer) {
		return toAjax(eduStatisticsComputerService.save( eduStatisticsComputer));

	}

	/**
	 * 修改保存电脑统计
	 */
	//@RequiresPermissions("system: eduStatisticsComputer:edit")
	@Log(title = "电脑统计管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody EduStatisticsComputer  eduStatisticsComputer) {
		return toAjax(eduStatisticsComputerService.update( eduStatisticsComputer));
	}
	
	
	/**
	 * 删除电脑统计
	 */
	//@RequiresPermissions("system: eduStatisticsComputer:remove")
	@Log(title = "电脑统计管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(eduStatisticsComputerService.delByIds(ids));
	}
}