package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.EduCourseSubject;
import com.yzit.project.dao.EduCourseSubjectDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>课程与科目中间表--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("eduCourseSubjectService")
public class EduCourseSubjectServiceImpl   implements EduCourseSubjectService {
	//private final static Logger log= Logger.getLogger(EduCourseSubjectService.class);
	
	@Autowired
	private EduCourseSubjectDao  eduCourseSubjectDao;

	/**
	 * 保持对象
	 * 
	 * @param eduCourseSubject
	 */
	public int save(EduCourseSubject  eduCourseSubject){
		return	eduCourseSubjectDao.save(eduCourseSubject);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return eduCourseSubjectDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param eduCourseSubject
	 */
	public int update(EduCourseSubject  eduCourseSubject){
		return eduCourseSubjectDao.update(eduCourseSubject);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduCourseSubject> findAll(){
		return eduCourseSubjectDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduCourseSubject
	 * @return
	 */
	public List<EduCourseSubject> findByList(EduCourseSubject  eduCourseSubject){
		return eduCourseSubjectDao.findByList(eduCourseSubject);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduCourseSubject  findById(Long id){
			return eduCourseSubjectDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param eduCourseSubject
	 * @return
	 */
	public Long findByCount(EduCourseSubject  eduCourseSubject){
		return eduCourseSubjectDao.findByCount(eduCourseSubject);
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
		
	public PageInfo<EduCourseSubject> findByPage(EduCourseSubject eduCourseSubject) {
		List<EduCourseSubject> eduCourseSubjectList= eduCourseSubjectDao.findByList(eduCourseSubject);
		//mybatis分页插件
		PageHelper.startPage(eduCourseSubject.getPageNo(), eduCourseSubject.getPageSize());
		PageInfo<EduCourseSubject> pageInfo = new PageInfo<EduCourseSubject>(eduCourseSubjectList);
        return pageInfo;
	}
	*/
}
