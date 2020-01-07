package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.EduStatisticsDay;
import com.yzit.project.service.EduStatisticsDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>天数统计--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/eduStatisticsDay")
public class EduStatisticsDayController extends BaseController {
	@Autowired
	private EduStatisticsDayService eduStatisticsDayService;

	//@RequiresPermissions("system: eduStatisticsDay:list")
	@PostMapping("/list")
	public TableDataInfo list(EduStatisticsDay  eduStatisticsDay) {
		startPage();
		List<EduStatisticsDay> list = eduStatisticsDayService.findByList( eduStatisticsDay);
		return getDataTable(list);
	}

	/*@Log(title = "天数统计管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: eduStatisticsDay:export")
	@GetMapping("/export")
	public AjaxResult export(EduStatisticsDay  eduStatisticsDay) {
		List<EduStatisticsDay> list = eduStatisticsDayService.findByList( eduStatisticsDay);
		ExcelUtil<EduStatisticsDay> util = new ExcelUtil<EduStatisticsDay>(Role.class);
		return util.exportExcel(list, "天数统计数据");
	}*/

	/**
	 * 根据天数统计编号获取详细信息
	 */
	//@RequiresPermissions("system: eduStatisticsDay:query")
	@GetMapping(value = "/{eduStatisticsDayId}")
	public AjaxResult getInfo(@PathVariable Long  eduStatisticsDayId) {
		return AjaxResult.success(eduStatisticsDayService.findById( eduStatisticsDayId));
	}

	/**
	 * 新增天数统计
	 */
	//@RequiresPermissions("system: eduStatisticsDay:add")
	@Log(title = "天数统计管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody EduStatisticsDay  eduStatisticsDay) {
		return toAjax(eduStatisticsDayService.save( eduStatisticsDay));

	}

	/**
	 * 修改保存天数统计
	 */
	//@RequiresPermissions("system: eduStatisticsDay:edit")
	@Log(title = "天数统计管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody EduStatisticsDay  eduStatisticsDay) {
		return toAjax(eduStatisticsDayService.update( eduStatisticsDay));
	}
	
	
	/**
	 * 删除天数统计
	 */
	//@RequiresPermissions("system: eduStatisticsDay:remove")
	@Log(title = "天数统计管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(eduStatisticsDayService.delByIds(ids));
	}
}