package com.yzit.project.dao;
import java.util.List;
import com.yzit.project.entity.EduPraise;
/**
 * 
 * <br>
 * <b>功能：</b>赞-持久层<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
public interface EduPraiseDao  {
	
	/**
	 * 保持对象
	 * 
	 * @param eduPraise
	 */
	public int save(EduPraise  eduPraise);

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id);

	/**
	 * 修改对象
	 * 
	 * @param eduPraise
	 */
	public int update(EduPraise  eduPraise);

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduPraise> findAll();

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduPraise
	 * @return
	 */
	public List<EduPraise> findByList(EduPraise  eduPraise);

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduPraise  findById(Long id);

	/**
	 * 检索总记录数
	 * 
	 * @param obj
	 * @return
	 */
	public Long findByCount(EduPraise  eduPraise);
	
}