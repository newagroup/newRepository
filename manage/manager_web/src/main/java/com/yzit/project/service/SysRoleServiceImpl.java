package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.SysRole;
import com.yzit.project.dao.SysRoleDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>角色--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("sysRoleService")
public class SysRoleServiceImpl   implements SysRoleService {
	//private final static Logger log= Logger.getLogger(SysRoleService.class);
	
	@Autowired
	private SysRoleDao  sysRoleDao;

	/**
	 * 保持对象
	 * 
	 * @param sysRole
	 */
	public int save(SysRole  sysRole){
		return	sysRoleDao.save(sysRole);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return sysRoleDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param sysRole
	 */
	public int update(SysRole  sysRole){
		return sysRoleDao.update(sysRole);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<SysRole> findAll(){
		return sysRoleDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param sysRole
	 * @return
	 */
	public List<SysRole> findByList(SysRole  sysRole){
		return sysRoleDao.findByList(sysRole);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public SysRole  findById(Long id){
			return sysRoleDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param sysRole
	 * @return
	 */
	public Long findByCount(SysRole  sysRole){
		return sysRoleDao.findByCount(sysRole);
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
		
	public PageInfo<SysRole> findByPage(SysRole sysRole) {
		List<SysRole> sysRoleList= sysRoleDao.findByList(sysRole);
		//mybatis分页插件
		PageHelper.startPage(sysRole.getPageNo(), sysRole.getPageSize());
		PageInfo<SysRole> pageInfo = new PageInfo<SysRole>(sysRoleList);
        return pageInfo;
	}
	*/
}
