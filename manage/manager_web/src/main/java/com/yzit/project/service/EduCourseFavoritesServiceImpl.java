package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.EduCourseFavorites;
import com.yzit.project.dao.EduCourseFavoritesDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>收藏课程--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("eduCourseFavoritesService")
public class EduCourseFavoritesServiceImpl   implements EduCourseFavoritesService {
	//private final static Logger log= Logger.getLogger(EduCourseFavoritesService.class);
	
	@Autowired
	private EduCourseFavoritesDao  eduCourseFavoritesDao;

	/**
	 * 保持对象
	 * 
	 * @param eduCourseFavorites
	 */
	public int save(EduCourseFavorites  eduCourseFavorites){
		return	eduCourseFavoritesDao.save(eduCourseFavorites);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return eduCourseFavoritesDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param eduCourseFavorites
	 */
	public int update(EduCourseFavorites  eduCourseFavorites){
		return eduCourseFavoritesDao.update(eduCourseFavorites);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduCourseFavorites> findAll(){
		return eduCourseFavoritesDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduCourseFavorites
	 * @return
	 */
	public List<EduCourseFavorites> findByList(EduCourseFavorites  eduCourseFavorites){
		return eduCourseFavoritesDao.findByList(eduCourseFavorites);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduCourseFavorites  findById(Long id){
			return eduCourseFavoritesDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param eduCourseFavorites
	 * @return
	 */
	public Long findByCount(EduCourseFavorites  eduCourseFavorites){
		return eduCourseFavoritesDao.findByCount(eduCourseFavorites);
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
		
	public PageInfo<EduCourseFavorites> findByPage(EduCourseFavorites eduCourseFavorites) {
		List<EduCourseFavorites> eduCourseFavoritesList= eduCourseFavoritesDao.findByList(eduCourseFavorites);
		//mybatis分页插件
		PageHelper.startPage(eduCourseFavorites.getPageNo(), eduCourseFavorites.getPageSize());
		PageInfo<EduCourseFavorites> pageInfo = new PageInfo<EduCourseFavorites>(eduCourseFavoritesList);
        return pageInfo;
	}
	*/
}
