package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.EduCourseNote;
import com.yzit.project.dao.EduCourseNoteDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>课程笔记--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("eduCourseNoteService")
public class EduCourseNoteServiceImpl   implements EduCourseNoteService {
	//private final static Logger log= Logger.getLogger(EduCourseNoteService.class);
	
	@Autowired
	private EduCourseNoteDao  eduCourseNoteDao;

	/**
	 * 保持对象
	 * 
	 * @param eduCourseNote
	 */
	public int save(EduCourseNote  eduCourseNote){
		return	eduCourseNoteDao.save(eduCourseNote);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return eduCourseNoteDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param eduCourseNote
	 */
	public int update(EduCourseNote  eduCourseNote){
		return eduCourseNoteDao.update(eduCourseNote);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduCourseNote> findAll(){
		return eduCourseNoteDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduCourseNote
	 * @return
	 */
	public List<EduCourseNote> findByList(EduCourseNote  eduCourseNote){
		return eduCourseNoteDao.findByList(eduCourseNote);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduCourseNote  findById(Long id){
			return eduCourseNoteDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param eduCourseNote
	 * @return
	 */
	public Long findByCount(EduCourseNote  eduCourseNote){
		return eduCourseNoteDao.findByCount(eduCourseNote);
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
		
	public PageInfo<EduCourseNote> findByPage(EduCourseNote eduCourseNote) {
		List<EduCourseNote> eduCourseNoteList= eduCourseNoteDao.findByList(eduCourseNote);
		//mybatis分页插件
		PageHelper.startPage(eduCourseNote.getPageNo(), eduCourseNote.getPageSize());
		PageInfo<EduCourseNote> pageInfo = new PageInfo<EduCourseNote>(eduCourseNoteList);
        return pageInfo;
	}
	*/
}
