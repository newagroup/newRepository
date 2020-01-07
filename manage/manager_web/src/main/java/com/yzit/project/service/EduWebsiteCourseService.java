package com.yzit.project.service;
import java.util.List;
import com.yzit.project.entity.EduWebsiteCourse;
//import com.github.pagehelper.PageInfo;
/**
 * 
 * <br>
 * <b>功能：</b>课程网站链接--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
public interface EduWebsiteCourseService {
	/**
	 * 保持对象
	 * 
	 * @param eduWebsiteCourse
	 */
	public int save(EduWebsiteCourse  eduWebsiteCourse);

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id);

	/**
	 * 修改对象
	 * 
	 * @param eduWebsiteCourse
	 */
	public int  update(EduWebsiteCourse  eduWebsiteCourse);

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduWebsiteCourse> findAll();

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduWebsiteCourse
	 * @return
	 */
	public List<EduWebsiteCourse> findByList(EduWebsiteCourse  eduWebsiteCourse);

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduWebsiteCourse  findById(Long id);

	/**
	 * 检索总记录数
	 * 
	 * @param eduWebsiteCourse
	 * @return
	 */
	public Long findByCount(EduWebsiteCourse  eduWebsiteCourse);
	
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
	//public PageInfo<EduWebsiteCourse> findByPage(EduWebsiteCourse  eduWebsiteCourse);
}