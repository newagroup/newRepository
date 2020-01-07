package com.yzit.project.service;
import java.util.List;
import com.yzit.project.entity.EduWebsiteImages;
//import com.github.pagehelper.PageInfo;
/**
 * 
 * <br>
 * <b>功能：</b>网站链接图片--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
public interface EduWebsiteImagesService {
	/**
	 * 保持对象
	 * 
	 * @param eduWebsiteImages
	 */
	public int save(EduWebsiteImages  eduWebsiteImages);

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id);

	/**
	 * 修改对象
	 * 
	 * @param eduWebsiteImages
	 */
	public int  update(EduWebsiteImages  eduWebsiteImages);

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduWebsiteImages> findAll();

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduWebsiteImages
	 * @return
	 */
	public List<EduWebsiteImages> findByList(EduWebsiteImages  eduWebsiteImages);

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduWebsiteImages  findById(Long id);

	/**
	 * 检索总记录数
	 * 
	 * @param eduWebsiteImages
	 * @return
	 */
	public Long findByCount(EduWebsiteImages  eduWebsiteImages);
	
	/**
     * 批量删除信息
     * 
     * @param ids 需要删除的ID集合
     * @return 结果
     */
    public int delByIds(String ids) ;
	/**
	 * 分页检索数据
	 * @param admDept
	 * @return
	 */
	//public PageInfo<EduWebsiteImages> findByPage(EduWebsiteImages  eduWebsiteImages);
}