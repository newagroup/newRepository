package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.EduCourse;
import com.yzit.project.dao.EduCourseDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>课程表--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("eduCourseService")
public class EduCourseServiceImpl   implements EduCourseService {
	//private final static Logger log= Logger.getLogger(EduCourseService.class);
	
	@Autowired
	private EduCourseDao  eduCourseDao;

	/**
	 * 保持对象
	 * 
	 * @param eduCourse
	 */
	public int save(EduCourse  eduCourse){
		return	eduCourseDao.save(eduCourse);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return eduCourseDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param eduCourse
	 */
	public int update(EduCourse  eduCourse){
		return eduCourseDao.update(eduCourse);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduCourse> findAll(){
		return eduCourseDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduCourse
	 * @return
	 */
	public List<EduCourse> findByList(EduCourse  eduCourse){
		return eduCourseDao.findByList(eduCourse);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduCourse  findById(Long id){
			return eduCourseDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param eduCourse
	 * @return
	 */
	public Long findByCount(EduCourse  eduCourse){
		return eduCourseDao.findByCount(eduCourse);
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
		
	public PageInfo<EduCourse> findByPage(EduCourse eduCourse) {
		List<EduCourse> eduCourseList= eduCourseDao.findByList(eduCourse);
		//mybatis分页插件
		PageHelper.startPage(eduCourse.getPageNo(), eduCourse.getPageSize());
		PageInfo<EduCourse> pageInfo = new PageInfo<EduCourse>(eduCourseList);
        return pageInfo;
	}
	*/
}
