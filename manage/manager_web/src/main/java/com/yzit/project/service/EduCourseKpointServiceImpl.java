package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.EduCourseKpoint;
import com.yzit.project.dao.EduCourseKpointDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>课程章节--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("eduCourseKpointService")
public class EduCourseKpointServiceImpl   implements EduCourseKpointService {
	//private final static Logger log= Logger.getLogger(EduCourseKpointService.class);
	
	@Autowired
	private EduCourseKpointDao  eduCourseKpointDao;

	/**
	 * 保持对象
	 * 
	 * @param eduCourseKpoint
	 */
	public int save(EduCourseKpoint  eduCourseKpoint){
		return	eduCourseKpointDao.save(eduCourseKpoint);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return eduCourseKpointDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param eduCourseKpoint
	 */
	public int update(EduCourseKpoint  eduCourseKpoint){
		return eduCourseKpointDao.update(eduCourseKpoint);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduCourseKpoint> findAll(){
		return eduCourseKpointDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduCourseKpoint
	 * @return
	 */
	public List<EduCourseKpoint> findByList(EduCourseKpoint  eduCourseKpoint){
		return eduCourseKpointDao.findByList(eduCourseKpoint);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduCourseKpoint  findById(Long id){
			return eduCourseKpointDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param eduCourseKpoint
	 * @return
	 */
	public Long findByCount(EduCourseKpoint  eduCourseKpoint){
		return eduCourseKpointDao.findByCount(eduCourseKpoint);
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
		
	public PageInfo<EduCourseKpoint> findByPage(EduCourseKpoint eduCourseKpoint) {
		List<EduCourseKpoint> eduCourseKpointList= eduCourseKpointDao.findByList(eduCourseKpoint);
		//mybatis分页插件
		PageHelper.startPage(eduCourseKpoint.getPageNo(), eduCourseKpoint.getPageSize());
		PageInfo<EduCourseKpoint> pageInfo = new PageInfo<EduCourseKpoint>(eduCourseKpointList);
        return pageInfo;
	}
	*/
}
