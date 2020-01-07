package com.yzit.project.service;
import java.util.List;
import com.yzit.project.entity.EduStatisticsComputer;
//import com.github.pagehelper.PageInfo;
/**
 * 
 * <br>
 * <b>功能：</b>电脑统计--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
public interface EduStatisticsComputerService {
	/**
	 * 保持对象
	 * 
	 * @param eduStatisticsComputer
	 */
	public int save(EduStatisticsComputer  eduStatisticsComputer);

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id);

	/**
	 * 修改对象
	 * 
	 * @param eduStatisticsComputer
	 */
	public int  update(EduStatisticsComputer  eduStatisticsComputer);

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduStatisticsComputer> findAll();

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduStatisticsComputer
	 * @return
	 */
	public List<EduStatisticsComputer> findByList(EduStatisticsComputer  eduStatisticsComputer);

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduStatisticsComputer  findById(Long id);

	/**
	 * 检索总记录数
	 * 
	 * @param eduStatisticsComputer
	 * @return
	 */
	public Long findByCount(EduStatisticsComputer  eduStatisticsComputer);
	
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
	//public PageInfo<EduStatisticsComputer> findByPage(EduStatisticsComputer  eduStatisticsComputer);
}