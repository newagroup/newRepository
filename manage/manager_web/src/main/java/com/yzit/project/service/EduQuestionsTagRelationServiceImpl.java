package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.EduQuestionsTagRelation;
import com.yzit.project.dao.EduQuestionsTagRelationDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>问题和问题类型中间表--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("eduQuestionsTagRelationService")
public class EduQuestionsTagRelationServiceImpl   implements EduQuestionsTagRelationService {
	//private final static Logger log= Logger.getLogger(EduQuestionsTagRelationService.class);
	
	@Autowired
	private EduQuestionsTagRelationDao  eduQuestionsTagRelationDao;

	/**
	 * 保持对象
	 * 
	 * @param eduQuestionsTagRelation
	 */
	public int save(EduQuestionsTagRelation  eduQuestionsTagRelation){
		return	eduQuestionsTagRelationDao.save(eduQuestionsTagRelation);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return eduQuestionsTagRelationDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param eduQuestionsTagRelation
	 */
	public int update(EduQuestionsTagRelation  eduQuestionsTagRelation){
		return eduQuestionsTagRelationDao.update(eduQuestionsTagRelation);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduQuestionsTagRelation> findAll(){
		return eduQuestionsTagRelationDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduQuestionsTagRelation
	 * @return
	 */
	public List<EduQuestionsTagRelation> findByList(EduQuestionsTagRelation  eduQuestionsTagRelation){
		return eduQuestionsTagRelationDao.findByList(eduQuestionsTagRelation);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduQuestionsTagRelation  findById(Long id){
			return eduQuestionsTagRelationDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param eduQuestionsTagRelation
	 * @return
	 */
	public Long findByCount(EduQuestionsTagRelation  eduQuestionsTagRelation){
		return eduQuestionsTagRelationDao.findByCount(eduQuestionsTagRelation);
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
		
	public PageInfo<EduQuestionsTagRelation> findByPage(EduQuestionsTagRelation eduQuestionsTagRelation) {
		List<EduQuestionsTagRelation> eduQuestionsTagRelationList= eduQuestionsTagRelationDao.findByList(eduQuestionsTagRelation);
		//mybatis分页插件
		PageHelper.startPage(eduQuestionsTagRelation.getPageNo(), eduQuestionsTagRelation.getPageSize());
		PageInfo<EduQuestionsTagRelation> pageInfo = new PageInfo<EduQuestionsTagRelation>(eduQuestionsTagRelationList);
        return pageInfo;
	}
	*/
}
