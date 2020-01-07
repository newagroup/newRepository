package com.yzit.project.dao;
import java.util.List;
import com.yzit.project.entity.SysUser;
/**
 * 
 * <br>
 * <b>功能：</b>用户表-持久层<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
public interface SysUserDao  {
	
	/**
	 * 保持对象
	 * 
	 * @param sysUser
	 */
	public int save(SysUser  sysUser);

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id);

	/**
	 * 修改对象
	 * 
	 * @param sysUser
	 */
	public int update(SysUser  sysUser);

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<SysUser> findAll();

	/**
	 * 根据条件检索对象
	 * 
	 * @param sysUser
	 * @return
	 */
	public List<SysUser> findByList(SysUser  sysUser);

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public SysUser  findById(Long id);

	/**
	 * 检索总记录数
	 * 
	 * @param obj
	 * @return
	 */
	public Long findByCount(SysUser  sysUser);
	
}