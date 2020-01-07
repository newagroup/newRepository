package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.EduWebsiteCourse;
import com.yzit.project.dao.EduWebsiteCourseDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>课程网站链接--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("eduWebsiteCourseService")
public class EduWebsiteCourseServiceImpl   implements EduWebsiteCourseService {
	//private final static Logger log= Logger.getLogger(EduWebsiteCourseService.class);
	
	@Autowired
	private EduWebsiteCourseDao  eduWebsiteCourseDao;

	/**
	 * 保持对象
	 * 
	 * @param eduWebsiteCourse
	 */
	public int save(EduWebsiteCourse  eduWebsiteCourse){
		return	eduWebsiteCourseDao.save(eduWebsiteCourse);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return eduWebsiteCourseDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param eduWebsiteCourse
	 */
	public int update(EduWebsiteCourse  eduWebsiteCourse){
		return eduWebsiteCourseDao.update(eduWebsiteCourse);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduWebsiteCourse> findAll(){
		return eduWebsiteCourseDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduWebsiteCourse
	 * @return
	 */
	public List<EduWebsiteCourse> findByList(EduWebsiteCourse  eduWebsiteCourse){
		return eduWebsiteCourseDao.findByList(eduWebsiteCourse);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduWebsiteCourse  findById(Long id){
			return eduWebsiteCourseDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param eduWebsiteCourse
	 * @return
	 */
	public Long findByCount(EduWebsiteCourse  eduWebsiteCourse){
		return eduWebsiteCourseDao.findByCount(eduWebsiteCourse);
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
		
	public PageInfo<EduWebsiteCourse> findByPage(EduWebsiteCourse eduWebsiteCourse) {
		List<EduWebsiteCourse> eduWebsiteCourseList= eduWebsiteCourseDao.findByList(eduWebsiteCourse);
		//mybatis分页插件
		PageHelper.startPage(eduWebsiteCourse.getPageNo(), eduWebsiteCourse.getPageSize());
		PageInfo<EduWebsiteCourse> pageInfo = new PageInfo<EduWebsiteCourse>(eduWebsiteCourseList);
        return pageInfo;
	}
	*/
}
