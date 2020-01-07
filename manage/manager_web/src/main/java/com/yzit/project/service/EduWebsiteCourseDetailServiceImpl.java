package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.EduWebsiteCourseDetail;
import com.yzit.project.dao.EduWebsiteCourseDetailDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>课程网站链接细节--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("eduWebsiteCourseDetailService")
public class EduWebsiteCourseDetailServiceImpl   implements EduWebsiteCourseDetailService {
	//private final static Logger log= Logger.getLogger(EduWebsiteCourseDetailService.class);
	
	@Autowired
	private EduWebsiteCourseDetailDao  eduWebsiteCourseDetailDao;

	/**
	 * 保持对象
	 * 
	 * @param eduWebsiteCourseDetail
	 */
	public int save(EduWebsiteCourseDetail  eduWebsiteCourseDetail){
		return	eduWebsiteCourseDetailDao.save(eduWebsiteCourseDetail);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return eduWebsiteCourseDetailDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param eduWebsiteCourseDetail
	 */
	public int update(EduWebsiteCourseDetail  eduWebsiteCourseDetail){
		return eduWebsiteCourseDetailDao.update(eduWebsiteCourseDetail);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduWebsiteCourseDetail> findAll(){
		return eduWebsiteCourseDetailDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduWebsiteCourseDetail
	 * @return
	 */
	public List<EduWebsiteCourseDetail> findByList(EduWebsiteCourseDetail  eduWebsiteCourseDetail){
		return eduWebsiteCourseDetailDao.findByList(eduWebsiteCourseDetail);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduWebsiteCourseDetail  findById(Long id){
			return eduWebsiteCourseDetailDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param eduWebsiteCourseDetail
	 * @return
	 */
	public Long findByCount(EduWebsiteCourseDetail  eduWebsiteCourseDetail){
		return eduWebsiteCourseDetailDao.findByCount(eduWebsiteCourseDetail);
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
		
	public PageInfo<EduWebsiteCourseDetail> findByPage(EduWebsiteCourseDetail eduWebsiteCourseDetail) {
		List<EduWebsiteCourseDetail> eduWebsiteCourseDetailList= eduWebsiteCourseDetailDao.findByList(eduWebsiteCourseDetail);
		//mybatis分页插件
		PageHelper.startPage(eduWebsiteCourseDetail.getPageNo(), eduWebsiteCourseDetail.getPageSize());
		PageInfo<EduWebsiteCourseDetail> pageInfo = new PageInfo<EduWebsiteCourseDetail>(eduWebsiteCourseDetailList);
        return pageInfo;
	}
	*/
}
