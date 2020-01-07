package com.yzit.project.controller;

import com.yzit.common.annotation.Log;
import com.yzit.common.domain.AjaxResult;
import com.yzit.common.domain.TableDataInfo;
import com.yzit.common.enums.BusinessType;
import com.yzit.project.entity.EduWebsiteProfile;
import com.yzit.project.service.EduWebsiteProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 
 * <br>
 * <b>功能：</b>网站链接轮廓简况--控制类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
@RestController
@CrossOrigin
@RequestMapping("/eduWebsiteProfile")
public class EduWebsiteProfileController extends BaseController {
	@Autowired
	private EduWebsiteProfileService eduWebsiteProfileService;

	//@RequiresPermissions("system: eduWebsiteProfile:list")
	@PostMapping("/list")
	public TableDataInfo list(EduWebsiteProfile  eduWebsiteProfile) {
		startPage();
		List<EduWebsiteProfile> list = eduWebsiteProfileService.findByList( eduWebsiteProfile);
		return getDataTable(list);
	}

	/*@Log(title = "网站链接轮廓简况管理", businessType = BusinessType.EXPORT)
	@RequiresPermissions("system: eduWebsiteProfile:export")
	@GetMapping("/export")
	public AjaxResult export(EduWebsiteProfile  eduWebsiteProfile) {
		List<EduWebsiteProfile> list = eduWebsiteProfileService.findByList( eduWebsiteProfile);
		ExcelUtil<EduWebsiteProfile> util = new ExcelUtil<EduWebsiteProfile>(Role.class);
		return util.exportExcel(list, "网站链接轮廓简况数据");
	}*/

	/**
	 * 根据网站链接轮廓简况编号获取详细信息
	 */
	//@RequiresPermissions("system: eduWebsiteProfile:query")
	@GetMapping(value = "/{eduWebsiteProfileId}")
	public AjaxResult getInfo(@PathVariable Long  eduWebsiteProfileId) {
		return AjaxResult.success(eduWebsiteProfileService.findById( eduWebsiteProfileId));
	}

	/**
	 * 新增网站链接轮廓简况
	 */
	//@RequiresPermissions("system: eduWebsiteProfile:add")
	@Log(title = "网站链接轮廓简况管理", businessType = BusinessType.INSERT)
	@PostMapping
	public AjaxResult add(@Validated @RequestBody EduWebsiteProfile  eduWebsiteProfile) {
		return toAjax(eduWebsiteProfileService.save( eduWebsiteProfile));

	}

	/**
	 * 修改保存网站链接轮廓简况
	 */
	//@RequiresPermissions("system: eduWebsiteProfile:edit")
	@Log(title = "网站链接轮廓简况管理", businessType = BusinessType.UPDATE)
	@PutMapping
	public AjaxResult edit(@Validated @RequestBody EduWebsiteProfile  eduWebsiteProfile) {
		return toAjax(eduWebsiteProfileService.update( eduWebsiteProfile));
	}
	
	
	/**
	 * 删除网站链接轮廓简况
	 */
	//@RequiresPermissions("system: eduWebsiteProfile:remove")
	@Log(title = "网站链接轮廓简况管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
	public AjaxResult remove(@PathVariable String ids) {
		return toAjax(eduWebsiteProfileService.delByIds(ids));
	}
}