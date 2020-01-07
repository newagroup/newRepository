package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.EduHelpMenu;
import com.yzit.project.dao.EduHelpMenuDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>帮助菜单--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("eduHelpMenuService")
public class EduHelpMenuServiceImpl   implements EduHelpMenuService {
	//private final static Logger log= Logger.getLogger(EduHelpMenuService.class);
	
	@Autowired
	private EduHelpMenuDao  eduHelpMenuDao;

	/**
	 * 保持对象
	 * 
	 * @param eduHelpMenu
	 */
	public int save(EduHelpMenu  eduHelpMenu){
		return	eduHelpMenuDao.save(eduHelpMenu);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return eduHelpMenuDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param eduHelpMenu
	 */
	public int update(EduHelpMenu  eduHelpMenu){
		return eduHelpMenuDao.update(eduHelpMenu);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduHelpMenu> findAll(){
		return eduHelpMenuDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduHelpMenu
	 * @return
	 */
	public List<EduHelpMenu> findByList(EduHelpMenu  eduHelpMenu){
		return eduHelpMenuDao.findByList(eduHelpMenu);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduHelpMenu  findById(Long id){
			return eduHelpMenuDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param eduHelpMenu
	 * @return
	 */
	public Long findByCount(EduHelpMenu  eduHelpMenu){
		return eduHelpMenuDao.findByCount(eduHelpMenu);
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
		
	public PageInfo<EduHelpMenu> findByPage(EduHelpMenu eduHelpMenu) {
		List<EduHelpMenu> eduHelpMenuList= eduHelpMenuDao.findByList(eduHelpMenu);
		//mybatis分页插件
		PageHelper.startPage(eduHelpMenu.getPageNo(), eduHelpMenu.getPageSize());
		PageInfo<EduHelpMenu> pageInfo = new PageInfo<EduHelpMenu>(eduHelpMenuList);
        return pageInfo;
	}
	*/
}
