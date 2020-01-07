package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.EduWebsiteProfile;
import com.yzit.project.dao.EduWebsiteProfileDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>网站链接轮廓简况--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("eduWebsiteProfileService")
public class EduWebsiteProfileServiceImpl   implements EduWebsiteProfileService {
	//private final static Logger log= Logger.getLogger(EduWebsiteProfileService.class);
	
	@Autowired
	private EduWebsiteProfileDao  eduWebsiteProfileDao;

	/**
	 * 保持对象
	 * 
	 * @param eduWebsiteProfile
	 */
	public int save(EduWebsiteProfile  eduWebsiteProfile){
		return	eduWebsiteProfileDao.save(eduWebsiteProfile);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return eduWebsiteProfileDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param eduWebsiteProfile
	 */
	public int update(EduWebsiteProfile  eduWebsiteProfile){
		return eduWebsiteProfileDao.update(eduWebsiteProfile);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduWebsiteProfile> findAll(){
		return eduWebsiteProfileDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduWebsiteProfile
	 * @return
	 */
	public List<EduWebsiteProfile> findByList(EduWebsiteProfile  eduWebsiteProfile){
		return eduWebsiteProfileDao.findByList(eduWebsiteProfile);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduWebsiteProfile  findById(Long id){
			return eduWebsiteProfileDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param eduWebsiteProfile
	 * @return
	 */
	public Long findByCount(EduWebsiteProfile  eduWebsiteProfile){
		return eduWebsiteProfileDao.findByCount(eduWebsiteProfile);
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
		
	public PageInfo<EduWebsiteProfile> findByPage(EduWebsiteProfile eduWebsiteProfile) {
		List<EduWebsiteProfile> eduWebsiteProfileList= eduWebsiteProfileDao.findByList(eduWebsiteProfile);
		//mybatis分页插件
		PageHelper.startPage(eduWebsiteProfile.getPageNo(), eduWebsiteProfile.getPageSize());
		PageInfo<EduWebsiteProfile> pageInfo = new PageInfo<EduWebsiteProfile>(eduWebsiteProfileList);
        return pageInfo;
	}
	*/
}
