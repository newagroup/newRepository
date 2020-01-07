package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.EduUser;
import com.yzit.project.dao.EduUserDao;
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
@Service("eduUserService")
public class EduUserServiceImpl   implements EduUserService {
	//private final static Logger log= Logger.getLogger(EduUserService.class);
	
	@Autowired
	private EduUserDao  eduUserDao;

	/**
	 * 保持对象
	 * 
	 * @param eduUser
	 */
	public int save(EduUser  eduUser){
		return	eduUserDao.save(eduUser);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return eduUserDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param eduUser
	 */
	public int update(EduUser  eduUser){
		return eduUserDao.update(eduUser);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduUser> findAll(){
		return eduUserDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduUser
	 * @return
	 */
	public List<EduUser> findByList(EduUser  eduUser){
		return eduUserDao.findByList(eduUser);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduUser  findById(Long id){
			return eduUserDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param eduUser
	 * @return
	 */
	public Long findByCount(EduUser  eduUser){
		return eduUserDao.findByCount(eduUser);
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
		
	public PageInfo<EduUser> findByPage(EduUser eduUser) {
		List<EduUser> eduUserList= eduUserDao.findByList(eduUser);
		//mybatis分页插件
		PageHelper.startPage(eduUser.getPageNo(), eduUser.getPageSize());
		PageInfo<EduUser> pageInfo = new PageInfo<EduUser>(eduUserList);
        return pageInfo;
	}
	*/
}
