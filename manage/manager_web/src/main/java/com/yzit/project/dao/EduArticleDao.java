package com.yzit.project.dao;
import java.util.List;
import com.yzit.project.entity.EduArticle;
/**
 * 
 * <br>
 * <b>功能：</b>文章表-持久层<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
public interface EduArticleDao  {
	
	/**
	 * 保持对象
	 * 
	 * @param eduArticle
	 */
	public int save(EduArticle  eduArticle);

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id);

	/**
	 * 修改对象
	 * 
	 * @param eduArticle
	 */
	public int update(EduArticle  eduArticle);

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduArticle> findAll();

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduArticle
	 * @return
	 */
	public List<EduArticle> findByList(EduArticle  eduArticle);

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduArticle  findById(Long id);

	/**
	 * 检索总记录数
	 * 
	 * @param obj
	 * @return
	 */
	public Long findByCount(EduArticle  eduArticle);
	
}