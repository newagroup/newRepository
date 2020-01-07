package com.yzit.project.dao;
import java.util.List;
import com.yzit.project.entity.EduWebsiteEhcache;
/**
 * 
 * <br>
 * <b>功能：</b>纯Java的进程内缓存框架的描述-持久层<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
public interface EduWebsiteEhcacheDao  {
	
	/**
	 * 保持对象
	 * 
	 * @param eduWebsiteEhcache
	 */
	public int save(EduWebsiteEhcache  eduWebsiteEhcache);

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id);

	/**
	 * 修改对象
	 * 
	 * @param eduWebsiteEhcache
	 */
	public int update(EduWebsiteEhcache  eduWebsiteEhcache);

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduWebsiteEhcache> findAll();

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduWebsiteEhcache
	 * @return
	 */
	public List<EduWebsiteEhcache> findByList(EduWebsiteEhcache  eduWebsiteEhcache);

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduWebsiteEhcache  findById(Long id);

	/**
	 * 检索总记录数
	 * 
	 * @param obj
	 * @return
	 */
	public Long findByCount(EduWebsiteEhcache  eduWebsiteEhcache);
	
}