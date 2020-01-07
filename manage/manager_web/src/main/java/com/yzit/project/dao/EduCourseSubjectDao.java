package com.yzit.project.dao;
import java.util.List;
import com.yzit.project.entity.EduCourseSubject;
/**
 * 
 * <br>
 * <b>功能：</b>课程与科目中间表-持久层<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
public interface EduCourseSubjectDao  {
	
	/**
	 * 保持对象
	 * 
	 * @param eduCourseSubject
	 */
	public int save(EduCourseSubject  eduCourseSubject);

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id);

	/**
	 * 修改对象
	 * 
	 * @param eduCourseSubject
	 */
	public int update(EduCourseSubject  eduCourseSubject);

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduCourseSubject> findAll();

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduCourseSubject
	 * @return
	 */
	public List<EduCourseSubject> findByList(EduCourseSubject  eduCourseSubject);

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduCourseSubject  findById(Long id);

	/**
	 * 检索总记录数
	 * 
	 * @param obj
	 * @return
	 */
	public Long findByCount(EduCourseSubject  eduCourseSubject);
	
}