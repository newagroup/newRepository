package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.EduStatisticsDay;
import com.yzit.project.dao.EduStatisticsDayDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>天数统计--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("eduStatisticsDayService")
public class EduStatisticsDayServiceImpl   implements EduStatisticsDayService {
	//private final static Logger log= Logger.getLogger(EduStatisticsDayService.class);
	
	@Autowired
	private EduStatisticsDayDao  eduStatisticsDayDao;

	/**
	 * 保持对象
	 * 
	 * @param eduStatisticsDay
	 */
	public int save(EduStatisticsDay  eduStatisticsDay){
		return	eduStatisticsDayDao.save(eduStatisticsDay);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return eduStatisticsDayDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param eduStatisticsDay
	 */
	public int update(EduStatisticsDay  eduStatisticsDay){
		return eduStatisticsDayDao.update(eduStatisticsDay);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduStatisticsDay> findAll(){
		return eduStatisticsDayDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduStatisticsDay
	 * @return
	 */
	public List<EduStatisticsDay> findByList(EduStatisticsDay  eduStatisticsDay){
		return eduStatisticsDayDao.findByList(eduStatisticsDay);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduStatisticsDay  findById(Long id){
			return eduStatisticsDayDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param eduStatisticsDay
	 * @return
	 */
	public Long findByCount(EduStatisticsDay  eduStatisticsDay){
		return eduStatisticsDayDao.findByCount(eduStatisticsDay);
	}
	
	/**
     * 批量删除信息
     * 
     * @param ids 需要删除的ID集合
     * @return 结果
     */
    public int delByIds(String ids) {
        Long[] idList = Convert.toLongArray(ids);
        int flag  =  0 ;
        for (Long id : idList) {
           this.delById(id);
           flag ++ ;
        }
        return flag;
    }
		
	/**
		
	public PageInfo<EduStatisticsDay> findByPage(EduStatisticsDay eduStatisticsDay) {
		List<EduStatisticsDay> eduStatisticsDayList= eduStatisticsDayDao.findByList(eduStatisticsDay);
		//mybatis分页插件
		PageHelper.startPage(eduStatisticsDay.getPageNo(), eduStatisticsDay.getPageSize());
		PageInfo<EduStatisticsDay> pageInfo = new PageInfo<EduStatisticsDay>(eduStatisticsDayList);
        return pageInfo;
	}
	*/
}
