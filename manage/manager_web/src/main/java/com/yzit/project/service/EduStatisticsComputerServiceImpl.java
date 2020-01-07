package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.EduStatisticsComputer;
import com.yzit.project.dao.EduStatisticsComputerDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>电脑统计--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("eduStatisticsComputerService")
public class EduStatisticsComputerServiceImpl   implements EduStatisticsComputerService {
	//private final static Logger log= Logger.getLogger(EduStatisticsComputerService.class);
	
	@Autowired
	private EduStatisticsComputerDao  eduStatisticsComputerDao;

	/**
	 * 保持对象
	 * 
	 * @param eduStatisticsComputer
	 */
	public int save(EduStatisticsComputer  eduStatisticsComputer){
		return	eduStatisticsComputerDao.save(eduStatisticsComputer);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return eduStatisticsComputerDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param eduStatisticsComputer
	 */
	public int update(EduStatisticsComputer  eduStatisticsComputer){
		return eduStatisticsComputerDao.update(eduStatisticsComputer);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduStatisticsComputer> findAll(){
		return eduStatisticsComputerDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduStatisticsComputer
	 * @return
	 */
	public List<EduStatisticsComputer> findByList(EduStatisticsComputer  eduStatisticsComputer){
		return eduStatisticsComputerDao.findByList(eduStatisticsComputer);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduStatisticsComputer  findById(Long id){
			return eduStatisticsComputerDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param eduStatisticsComputer
	 * @return
	 */
	public Long findByCount(EduStatisticsComputer  eduStatisticsComputer){
		return eduStatisticsComputerDao.findByCount(eduStatisticsComputer);
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
		
	public PageInfo<EduStatisticsComputer> findByPage(EduStatisticsComputer eduStatisticsComputer) {
		List<EduStatisticsComputer> eduStatisticsComputerList= eduStatisticsComputerDao.findByList(eduStatisticsComputer);
		//mybatis分页插件
		PageHelper.startPage(eduStatisticsComputer.getPageNo(), eduStatisticsComputer.getPageSize());
		PageInfo<EduStatisticsComputer> pageInfo = new PageInfo<EduStatisticsComputer>(eduStatisticsComputerList);
        return pageInfo;
	}
	*/
}
