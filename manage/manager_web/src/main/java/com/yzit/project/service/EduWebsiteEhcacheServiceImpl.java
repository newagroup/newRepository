package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.EduWebsiteEhcache;
import com.yzit.project.dao.EduWebsiteEhcacheDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>纯Java的进程内缓存框架的描述--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("eduWebsiteEhcacheService")
public class EduWebsiteEhcacheServiceImpl   implements EduWebsiteEhcacheService {
	//private final static Logger log= Logger.getLogger(EduWebsiteEhcacheService.class);
	
	@Autowired
	private EduWebsiteEhcacheDao  eduWebsiteEhcacheDao;

	/**
	 * 保持对象
	 * 
	 * @param eduWebsiteEhcache
	 */
	public int save(EduWebsiteEhcache  eduWebsiteEhcache){
		return	eduWebsiteEhcacheDao.save(eduWebsiteEhcache);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return eduWebsiteEhcacheDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param eduWebsiteEhcache
	 */
	public int update(EduWebsiteEhcache  eduWebsiteEhcache){
		return eduWebsiteEhcacheDao.update(eduWebsiteEhcache);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduWebsiteEhcache> findAll(){
		return eduWebsiteEhcacheDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduWebsiteEhcache
	 * @return
	 */
	public List<EduWebsiteEhcache> findByList(EduWebsiteEhcache  eduWebsiteEhcache){
		return eduWebsiteEhcacheDao.findByList(eduWebsiteEhcache);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduWebsiteEhcache  findById(Long id){
			return eduWebsiteEhcacheDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param eduWebsiteEhcache
	 * @return
	 */
	public Long findByCount(EduWebsiteEhcache  eduWebsiteEhcache){
		return eduWebsiteEhcacheDao.findByCount(eduWebsiteEhcache);
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
		
	public PageInfo<EduWebsiteEhcache> findByPage(EduWebsiteEhcache eduWebsiteEhcache) {
		List<EduWebsiteEhcache> eduWebsiteEhcacheList= eduWebsiteEhcacheDao.findByList(eduWebsiteEhcache);
		//mybatis分页插件
		PageHelper.startPage(eduWebsiteEhcache.getPageNo(), eduWebsiteEhcache.getPageSize());
		PageInfo<EduWebsiteEhcache> pageInfo = new PageInfo<EduWebsiteEhcache>(eduWebsiteEhcacheList);
        return pageInfo;
	}
	*/
}
