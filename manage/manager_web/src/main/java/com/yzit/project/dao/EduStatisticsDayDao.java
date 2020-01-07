package com.yzit.project.dao;
import java.util.List;
import com.yzit.project.entity.EduStatisticsDay;
/**
 * 
 * <br>
 * <b>功能：</b>天数统计-持久层<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
public interface EduStatisticsDayDao  {
	
	/**
	 * 保持对象
	 * 
	 * @param eduStatisticsDay
	 */
	public int save(EduStatisticsDay  eduStatisticsDay);

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id);

	/**
	 * 修改对象
	 * 
	 * @param eduStatisticsDay
	 */
	public int update(EduStatisticsDay  eduStatisticsDay);

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduStatisticsDay> findAll();

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduStatisticsDay
	 * @return
	 */
	public List<EduStatisticsDay> findByList(EduStatisticsDay  eduStatisticsDay);

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduStatisticsDay  findById(Long id);

	/**
	 * 检索总记录数
	 * 
	 * @param obj
	 * @return
	 */
	public Long findByCount(EduStatisticsDay  eduStatisticsDay);
	
}