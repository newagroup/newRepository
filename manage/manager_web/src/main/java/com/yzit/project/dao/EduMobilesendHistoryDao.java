package com.yzit.project.dao;
import java.util.List;
import com.yzit.project.entity.EduMobilesendHistory;
/**
 * 
 * <br>
 * <b>功能：</b>发送自手机的历史记录-持久层<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
public interface EduMobilesendHistoryDao  {
	
	/**
	 * 保持对象
	 * 
	 * @param eduMobilesendHistory
	 */
	public int save(EduMobilesendHistory  eduMobilesendHistory);

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id);

	/**
	 * 修改对象
	 * 
	 * @param eduMobilesendHistory
	 */
	public int update(EduMobilesendHistory  eduMobilesendHistory);

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduMobilesendHistory> findAll();

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduMobilesendHistory
	 * @return
	 */
	public List<EduMobilesendHistory> findByList(EduMobilesendHistory  eduMobilesendHistory);

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduMobilesendHistory  findById(Long id);

	/**
	 * 检索总记录数
	 * 
	 * @param obj
	 * @return
	 */
	public Long findByCount(EduMobilesendHistory  eduMobilesendHistory);
	
}