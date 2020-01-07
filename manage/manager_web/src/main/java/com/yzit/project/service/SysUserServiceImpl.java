package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.SysUser;
import com.yzit.project.dao.SysUserDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>用户表--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("sysUserService")
public class SysUserServiceImpl   implements SysUserService {
	//private final static Logger log= Logger.getLogger(SysUserService.class);
	
	@Autowired
	private SysUserDao  sysUserDao;

	/**
	 * 保持对象
	 * 
	 * @param sysUser
	 */
	public int save(SysUser  sysUser){
		return	sysUserDao.save(sysUser);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return sysUserDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param sysUser
	 */
	public int update(SysUser  sysUser){
		return sysUserDao.update(sysUser);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<SysUser> findAll(){
		return sysUserDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param sysUser
	 * @return
	 */
	public List<SysUser> findByList(SysUser  sysUser){
		return sysUserDao.findByList(sysUser);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public SysUser  findById(Long id){
			return sysUserDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param sysUser
	 * @return
	 */
	public Long findByCount(SysUser  sysUser){
		return sysUserDao.findByCount(sysUser);
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
		
	public PageInfo<SysUser> findByPage(SysUser sysUser) {
		List<SysUser> sysUserList= sysUserDao.findByList(sysUser);
		//mybatis分页插件
		PageHelper.startPage(sysUser.getPageNo(), sysUser.getPageSize());
		PageInfo<SysUser> pageInfo = new PageInfo<SysUser>(sysUserList);
        return pageInfo;
	}
	*/
}
