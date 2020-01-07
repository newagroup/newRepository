package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.EduTeacher;
import com.yzit.project.dao.EduTeacherDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>教师表--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("eduTeacherService")
public class EduTeacherServiceImpl   implements EduTeacherService {
	//private final static Logger log= Logger.getLogger(EduTeacherService.class);
	
	@Autowired
	private EduTeacherDao  eduTeacherDao;

	/**
	 * 保持对象
	 * 
	 * @param eduTeacher
	 */
	public int save(EduTeacher  eduTeacher){
		return	eduTeacherDao.save(eduTeacher);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return eduTeacherDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param eduTeacher
	 */
	public int update(EduTeacher  eduTeacher){
		return eduTeacherDao.update(eduTeacher);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduTeacher> findAll(){
		return eduTeacherDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduTeacher
	 * @return
	 */
	public List<EduTeacher> findByList(EduTeacher  eduTeacher){
		return eduTeacherDao.findByList(eduTeacher);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduTeacher  findById(Long id){
			return eduTeacherDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param eduTeacher
	 * @return
	 */
	public Long findByCount(EduTeacher  eduTeacher){
		return eduTeacherDao.findByCount(eduTeacher);
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
		
	public PageInfo<EduTeacher> findByPage(EduTeacher eduTeacher) {
		List<EduTeacher> eduTeacherList= eduTeacherDao.findByList(eduTeacher);
		//mybatis分页插件
		PageHelper.startPage(eduTeacher.getPageNo(), eduTeacher.getPageSize());
		PageInfo<EduTeacher> pageInfo = new PageInfo<EduTeacher>(eduTeacherList);
        return pageInfo;
	}
	*/
}
