package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.EduWebsiteNavigate;
import com.yzit.project.dao.EduWebsiteNavigateDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>网站链接导航--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("eduWebsiteNavigateService")
public class EduWebsiteNavigateServiceImpl   implements EduWebsiteNavigateService {
	//private final static Logger log= Logger.getLogger(EduWebsiteNavigateService.class);
	
	@Autowired
	private EduWebsiteNavigateDao  eduWebsiteNavigateDao;

	/**
	 * 保持对象
	 * 
	 * @param eduWebsiteNavigate
	 */
	public int save(EduWebsiteNavigate  eduWebsiteNavigate){
		return	eduWebsiteNavigateDao.save(eduWebsiteNavigate);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return eduWebsiteNavigateDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param eduWebsiteNavigate
	 */
	public int update(EduWebsiteNavigate  eduWebsiteNavigate){
		return eduWebsiteNavigateDao.update(eduWebsiteNavigate);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduWebsiteNavigate> findAll(){
		return eduWebsiteNavigateDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduWebsiteNavigate
	 * @return
	 */
	public List<EduWebsiteNavigate> findByList(EduWebsiteNavigate  eduWebsiteNavigate){
		return eduWebsiteNavigateDao.findByList(eduWebsiteNavigate);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduWebsiteNavigate  findById(Long id){
			return eduWebsiteNavigateDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param eduWebsiteNavigate
	 * @return
	 */
	public Long findByCount(EduWebsiteNavigate  eduWebsiteNavigate){
		return eduWebsiteNavigateDao.findByCount(eduWebsiteNavigate);
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
		
	public PageInfo<EduWebsiteNavigate> findByPage(EduWebsiteNavigate eduWebsiteNavigate) {
		List<EduWebsiteNavigate> eduWebsiteNavigateList= eduWebsiteNavigateDao.findByList(eduWebsiteNavigate);
		//mybatis分页插件
		PageHelper.startPage(eduWebsiteNavigate.getPageNo(), eduWebsiteNavigate.getPageSize());
		PageInfo<EduWebsiteNavigate> pageInfo = new PageInfo<EduWebsiteNavigate>(eduWebsiteNavigateList);
        return pageInfo;
	}
	*/
}
