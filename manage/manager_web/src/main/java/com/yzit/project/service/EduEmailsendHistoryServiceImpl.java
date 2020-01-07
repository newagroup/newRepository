package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.EduEmailsendHistory;
import com.yzit.project.dao.EduEmailsendHistoryDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>电子邮件记录--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("eduEmailsendHistoryService")
public class EduEmailsendHistoryServiceImpl   implements EduEmailsendHistoryService {
	//private final static Logger log= Logger.getLogger(EduEmailsendHistoryService.class);
	
	@Autowired
	private EduEmailsendHistoryDao  eduEmailsendHistoryDao;

	/**
	 * 保持对象
	 * 
	 * @param eduEmailsendHistory
	 */
	public int save(EduEmailsendHistory  eduEmailsendHistory){
		return	eduEmailsendHistoryDao.save(eduEmailsendHistory);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return eduEmailsendHistoryDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param eduEmailsendHistory
	 */
	public int update(EduEmailsendHistory  eduEmailsendHistory){
		return eduEmailsendHistoryDao.update(eduEmailsendHistory);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduEmailsendHistory> findAll(){
		return eduEmailsendHistoryDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduEmailsendHistory
	 * @return
	 */
	public List<EduEmailsendHistory> findByList(EduEmailsendHistory  eduEmailsendHistory){
		return eduEmailsendHistoryDao.findByList(eduEmailsendHistory);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduEmailsendHistory  findById(Long id){
			return eduEmailsendHistoryDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param eduEmailsendHistory
	 * @return
	 */
	public Long findByCount(EduEmailsendHistory  eduEmailsendHistory){
		return eduEmailsendHistoryDao.findByCount(eduEmailsendHistory);
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
		
	public PageInfo<EduEmailsendHistory> findByPage(EduEmailsendHistory eduEmailsendHistory) {
		List<EduEmailsendHistory> eduEmailsendHistoryList= eduEmailsendHistoryDao.findByList(eduEmailsendHistory);
		//mybatis分页插件
		PageHelper.startPage(eduEmailsendHistory.getPageNo(), eduEmailsendHistory.getPageSize());
		PageInfo<EduEmailsendHistory> pageInfo = new PageInfo<EduEmailsendHistory>(eduEmailsendHistoryList);
        return pageInfo;
	}
	*/
}
