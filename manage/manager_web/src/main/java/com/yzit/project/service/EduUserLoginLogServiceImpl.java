package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.EduUserLoginLog;
import com.yzit.project.dao.EduUserLoginLogDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>用户登录日志--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("eduUserLoginLogService")
public class EduUserLoginLogServiceImpl   implements EduUserLoginLogService {
	//private final static Logger log= Logger.getLogger(EduUserLoginLogService.class);
	
	@Autowired
	private EduUserLoginLogDao  eduUserLoginLogDao;

	/**
	 * 保持对象
	 * 
	 * @param eduUserLoginLog
	 */
	public int save(EduUserLoginLog  eduUserLoginLog){
		return	eduUserLoginLogDao.save(eduUserLoginLog);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return eduUserLoginLogDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param eduUserLoginLog
	 */
	public int update(EduUserLoginLog  eduUserLoginLog){
		return eduUserLoginLogDao.update(eduUserLoginLog);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduUserLoginLog> findAll(){
		return eduUserLoginLogDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduUserLoginLog
	 * @return
	 */
	public List<EduUserLoginLog> findByList(EduUserLoginLog  eduUserLoginLog){
		return eduUserLoginLogDao.findByList(eduUserLoginLog);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduUserLoginLog  findById(Long id){
			return eduUserLoginLogDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param eduUserLoginLog
	 * @return
	 */
	public Long findByCount(EduUserLoginLog  eduUserLoginLog){
		return eduUserLoginLogDao.findByCount(eduUserLoginLog);
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
		
	public PageInfo<EduUserLoginLog> findByPage(EduUserLoginLog eduUserLoginLog) {
		List<EduUserLoginLog> eduUserLoginLogList= eduUserLoginLogDao.findByList(eduUserLoginLog);
		//mybatis分页插件
		PageHelper.startPage(eduUserLoginLog.getPageNo(), eduUserLoginLog.getPageSize());
		PageInfo<EduUserLoginLog> pageInfo = new PageInfo<EduUserLoginLog>(eduUserLoginLogList);
        return pageInfo;
	}
	*/
}
