package com.yzit.project.dao;
import java.util.List;
import com.yzit.project.entity.EduWebsiteCourseDetail;
/**
 * 
 * <br>
 * <b>功能：</b>课程网站链接细节-持久层<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
public interface EduWebsiteCourseDetailDao  {
	
	/**
	 * 保持对象
	 * 
	 * @param eduWebsiteCourseDetail
	 */
	public int save(EduWebsiteCourseDetail  eduWebsiteCourseDetail);

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id);

	/**
	 * 修改对象
	 * 
	 * @param eduWebsiteCourseDetail
	 */
	public int update(EduWebsiteCourseDetail  eduWebsiteCourseDetail);

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduWebsiteCourseDetail> findAll();

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduWebsiteCourseDetail
	 * @return
	 */
	public List<EduWebsiteCourseDetail> findByList(EduWebsiteCourseDetail  eduWebsiteCourseDetail);

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduWebsiteCourseDetail  findById(Long id);

	/**
	 * 检索总记录数
	 * 
	 * @param obj
	 * @return
	 */
	public Long findByCount(EduWebsiteCourseDetail  eduWebsiteCourseDetail);
	
}