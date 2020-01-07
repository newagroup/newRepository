package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.EduWebsiteImages;
import com.yzit.project.dao.EduWebsiteImagesDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>网站链接图片--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("eduWebsiteImagesService")
public class EduWebsiteImagesServiceImpl   implements EduWebsiteImagesService {
	//private final static Logger log= Logger.getLogger(EduWebsiteImagesService.class);
	
	@Autowired
	private EduWebsiteImagesDao  eduWebsiteImagesDao;

	/**
	 * 保持对象
	 * 
	 * @param eduWebsiteImages
	 */
	public int save(EduWebsiteImages  eduWebsiteImages){
		return	eduWebsiteImagesDao.save(eduWebsiteImages);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return eduWebsiteImagesDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param eduWebsiteImages
	 */
	public int update(EduWebsiteImages  eduWebsiteImages){
		return eduWebsiteImagesDao.update(eduWebsiteImages);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduWebsiteImages> findAll(){
		return eduWebsiteImagesDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduWebsiteImages
	 * @return
	 */
	public List<EduWebsiteImages> findByList(EduWebsiteImages  eduWebsiteImages){
		return eduWebsiteImagesDao.findByList(eduWebsiteImages);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduWebsiteImages  findById(Long id){
			return eduWebsiteImagesDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param eduWebsiteImages
	 * @return
	 */
	public Long findByCount(EduWebsiteImages  eduWebsiteImages){
		return eduWebsiteImagesDao.findByCount(eduWebsiteImages);
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
		
	public PageInfo<EduWebsiteImages> findByPage(EduWebsiteImages eduWebsiteImages) {
		List<EduWebsiteImages> eduWebsiteImagesList= eduWebsiteImagesDao.findByList(eduWebsiteImages);
		//mybatis分页插件
		PageHelper.startPage(eduWebsiteImages.getPageNo(), eduWebsiteImages.getPageSize());
		PageInfo<EduWebsiteImages> pageInfo = new PageInfo<EduWebsiteImages>(eduWebsiteImagesList);
        return pageInfo;
	}
	*/
}
