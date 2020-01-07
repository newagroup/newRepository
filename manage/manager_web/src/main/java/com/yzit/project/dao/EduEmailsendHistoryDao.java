package com.yzit.project.dao;
import java.util.List;
import com.yzit.project.entity.EduEmailsendHistory;
/**
 * 
 * <br>
 * <b>功能：</b>电子邮件记录-持久层<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
public interface EduEmailsendHistoryDao  {
	
	/**
	 * 保持对象
	 * 
	 * @param eduEmailsendHistory
	 */
	public int save(EduEmailsendHistory  eduEmailsendHistory);

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id);

	/**
	 * 修改对象
	 * 
	 * @param eduEmailsendHistory
	 */
	public int update(EduEmailsendHistory  eduEmailsendHistory);

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduEmailsendHistory> findAll();

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduEmailsendHistory
	 * @return
	 */
	public List<EduEmailsendHistory> findByList(EduEmailsendHistory  eduEmailsendHistory);

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduEmailsendHistory  findById(Long id);

	/**
	 * 检索总记录数
	 * 
	 * @param obj
	 * @return
	 */
	public Long findByCount(EduEmailsendHistory  eduEmailsendHistory);
	
}