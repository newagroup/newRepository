package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.EduWebsiteImagesType;
import com.yzit.project.dao.EduWebsiteImagesTypeDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>网站链接图片类型--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("eduWebsiteImagesTypeService")
public class EduWebsiteImagesTypeServiceImpl   implements EduWebsiteImagesTypeService {
	//private final static Logger log= Logger.getLogger(EduWebsiteImagesTypeService.class);
	
	@Autowired
	private EduWebsiteImagesTypeDao  eduWebsiteImagesTypeDao;

	/**
	 * 保持对象
	 * 
	 * @param eduWebsiteImagesType
	 */
	public int save(EduWebsiteImagesType  eduWebsiteImagesType){
		return	eduWebsiteImagesTypeDao.save(eduWebsiteImagesType);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return eduWebsiteImagesTypeDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param eduWebsiteImagesType
	 */
	public int update(EduWebsiteImagesType  eduWebsiteImagesType){
		return eduWebsiteImagesTypeDao.update(eduWebsiteImagesType);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduWebsiteImagesType> findAll(){
		return eduWebsiteImagesTypeDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduWebsiteImagesType
	 * @return
	 */
	public List<EduWebsiteImagesType> findByList(EduWebsiteImagesType  eduWebsiteImagesType){
		return eduWebsiteImagesTypeDao.findByList(eduWebsiteImagesType);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduWebsiteImagesType  findById(Long id){
			return eduWebsiteImagesTypeDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param eduWebsiteImagesType
	 * @return
	 */
	public Long findByCount(EduWebsiteImagesType  eduWebsiteImagesType){
		return eduWebsiteImagesTypeDao.findByCount(eduWebsiteImagesType);
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
		
	public PageInfo<EduWebsiteImagesType> findByPage(EduWebsiteImagesType eduWebsiteImagesType) {
		List<EduWebsiteImagesType> eduWebsiteImagesTypeList= eduWebsiteImagesTypeDao.findByList(eduWebsiteImagesType);
		//mybatis分页插件
		PageHelper.startPage(eduWebsiteImagesType.getPageNo(), eduWebsiteImagesType.getPageSize());
		PageInfo<EduWebsiteImagesType> pageInfo = new PageInfo<EduWebsiteImagesType>(eduWebsiteImagesTypeList);
        return pageInfo;
	}
	*/
}
