package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.EduCourseStudyhistory;
import com.yzit.project.dao.EduCourseStudyhistoryDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>课程学习记录--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("eduCourseStudyhistoryService")
public class EduCourseStudyhistoryServiceImpl   implements EduCourseStudyhistoryService {
	//private final static Logger log= Logger.getLogger(EduCourseStudyhistoryService.class);
	
	@Autowired
	private EduCourseStudyhistoryDao  eduCourseStudyhistoryDao;

	/**
	 * 保持对象
	 * 
	 * @param eduCourseStudyhistory
	 */
	public int save(EduCourseStudyhistory  eduCourseStudyhistory){
		return	eduCourseStudyhistoryDao.save(eduCourseStudyhistory);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return eduCourseStudyhistoryDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param eduCourseStudyhistory
	 */
	public int update(EduCourseStudyhistory  eduCourseStudyhistory){
		return eduCourseStudyhistoryDao.update(eduCourseStudyhistory);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduCourseStudyhistory> findAll(){
		return eduCourseStudyhistoryDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduCourseStudyhistory
	 * @return
	 */
	public List<EduCourseStudyhistory> findByList(EduCourseStudyhistory  eduCourseStudyhistory){
		return eduCourseStudyhistoryDao.findByList(eduCourseStudyhistory);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduCourseStudyhistory  findById(Long id){
			return eduCourseStudyhistoryDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param eduCourseStudyhistory
	 * @return
	 */
	public Long findByCount(EduCourseStudyhistory  eduCourseStudyhistory){
		return eduCourseStudyhistoryDao.findByCount(eduCourseStudyhistory);
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
		
	public PageInfo<EduCourseStudyhistory> findByPage(EduCourseStudyhistory eduCourseStudyhistory) {
		List<EduCourseStudyhistory> eduCourseStudyhistoryList= eduCourseStudyhistoryDao.findByList(eduCourseStudyhistory);
		//mybatis分页插件
		PageHelper.startPage(eduCourseStudyhistory.getPageNo(), eduCourseStudyhistory.getPageSize());
		PageInfo<EduCourseStudyhistory> pageInfo = new PageInfo<EduCourseStudyhistory>(eduCourseStudyhistoryList);
        return pageInfo;
	}
	*/
}
