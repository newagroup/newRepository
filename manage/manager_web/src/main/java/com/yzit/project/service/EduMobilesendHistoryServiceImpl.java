package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.EduMobilesendHistory;
import com.yzit.project.dao.EduMobilesendHistoryDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>发送自手机的历史记录--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("eduMobilesendHistoryService")
public class EduMobilesendHistoryServiceImpl   implements EduMobilesendHistoryService {
	//private final static Logger log= Logger.getLogger(EduMobilesendHistoryService.class);
	
	@Autowired
	private EduMobilesendHistoryDao  eduMobilesendHistoryDao;

	/**
	 * 保持对象
	 * 
	 * @param eduMobilesendHistory
	 */
	public int save(EduMobilesendHistory  eduMobilesendHistory){
		return	eduMobilesendHistoryDao.save(eduMobilesendHistory);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return eduMobilesendHistoryDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param eduMobilesendHistory
	 */
	public int update(EduMobilesendHistory  eduMobilesendHistory){
		return eduMobilesendHistoryDao.update(eduMobilesendHistory);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduMobilesendHistory> findAll(){
		return eduMobilesendHistoryDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduMobilesendHistory
	 * @return
	 */
	public List<EduMobilesendHistory> findByList(EduMobilesendHistory  eduMobilesendHistory){
		return eduMobilesendHistoryDao.findByList(eduMobilesendHistory);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduMobilesendHistory  findById(Long id){
			return eduMobilesendHistoryDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param eduMobilesendHistory
	 * @return
	 */
	public Long findByCount(EduMobilesendHistory  eduMobilesendHistory){
		return eduMobilesendHistoryDao.findByCount(eduMobilesendHistory);
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
		
	public PageInfo<EduMobilesendHistory> findByPage(EduMobilesendHistory eduMobilesendHistory) {
		List<EduMobilesendHistory> eduMobilesendHistoryList= eduMobilesendHistoryDao.findByList(eduMobilesendHistory);
		//mybatis分页插件
		PageHelper.startPage(eduMobilesendHistory.getPageNo(), eduMobilesendHistory.getPageSize());
		PageInfo<EduMobilesendHistory> pageInfo = new PageInfo<EduMobilesendHistory>(eduMobilesendHistoryList);
        return pageInfo;
	}
	*/
}
