package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.SysLoginLog;
import com.yzit.project.dao.SysLoginLogDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b> 登录日志--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("sysLoginLogService")
public class SysLoginLogServiceImpl   implements SysLoginLogService {
	//private final static Logger log= Logger.getLogger(SysLoginLogService.class);
	
	@Autowired
	private SysLoginLogDao  sysLoginLogDao;

	/**
	 * 保持对象
	 * 
	 * @param sysLoginLog
	 */
	public int save(SysLoginLog  sysLoginLog){
		return	sysLoginLogDao.save(sysLoginLog);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return sysLoginLogDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param sysLoginLog
	 */
	public int update(SysLoginLog  sysLoginLog){
		return sysLoginLogDao.update(sysLoginLog);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<SysLoginLog> findAll(){
		return sysLoginLogDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param sysLoginLog
	 * @return
	 */
	public List<SysLoginLog> findByList(SysLoginLog  sysLoginLog){
		return sysLoginLogDao.findByList(sysLoginLog);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public SysLoginLog  findById(Long id){
			return sysLoginLogDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param sysLoginLog
	 * @return
	 */
	public Long findByCount(SysLoginLog  sysLoginLog){
		return sysLoginLogDao.findByCount(sysLoginLog);
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
		
	public PageInfo<SysLoginLog> findByPage(SysLoginLog sysLoginLog) {
		List<SysLoginLog> sysLoginLogList= sysLoginLogDao.findByList(sysLoginLog);
		//mybatis分页插件
		PageHelper.startPage(sysLoginLog.getPageNo(), sysLoginLog.getPageSize());
		PageInfo<SysLoginLog> pageInfo = new PageInfo<SysLoginLog>(sysLoginLogList);
        return pageInfo;
	}
	*/
}
