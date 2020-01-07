package com.yzit.project.dao;
import java.util.List;
import com.yzit.project.entity.EduQuestionsTagRelation;
/**
 * 
 * <br>
 * <b>功能：</b>问题和问题类型中间表-持久层<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
public interface EduQuestionsTagRelationDao  {
	
	/**
	 * 保持对象
	 * 
	 * @param eduQuestionsTagRelation
	 */
	public int save(EduQuestionsTagRelation  eduQuestionsTagRelation);

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id);

	/**
	 * 修改对象
	 * 
	 * @param eduQuestionsTagRelation
	 */
	public int update(EduQuestionsTagRelation  eduQuestionsTagRelation);

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduQuestionsTagRelation> findAll();

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduQuestionsTagRelation
	 * @return
	 */
	public List<EduQuestionsTagRelation> findByList(EduQuestionsTagRelation  eduQuestionsTagRelation);

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduQuestionsTagRelation  findById(Long id);

	/**
	 * 检索总记录数
	 * 
	 * @param obj
	 * @return
	 */
	public Long findByCount(EduQuestionsTagRelation  eduQuestionsTagRelation);
	
}