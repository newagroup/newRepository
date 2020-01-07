package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.EduQuestionsTag;
import com.yzit.project.dao.EduQuestionsTagDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>问题关于的课程类型--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("eduQuestionsTagService")
public class EduQuestionsTagServiceImpl   implements EduQuestionsTagService {
	//private final static Logger log= Logger.getLogger(EduQuestionsTagService.class);
	
	@Autowired
	private EduQuestionsTagDao  eduQuestionsTagDao;

	/**
	 * 保持对象
	 * 
	 * @param eduQuestionsTag
	 */
	public int save(EduQuestionsTag  eduQuestionsTag){
		return	eduQuestionsTagDao.save(eduQuestionsTag);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return eduQuestionsTagDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param eduQuestionsTag
	 */
	public int update(EduQuestionsTag  eduQuestionsTag){
		return eduQuestionsTagDao.update(eduQuestionsTag);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduQuestionsTag> findAll(){
		return eduQuestionsTagDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduQuestionsTag
	 * @return
	 */
	public List<EduQuestionsTag> findByList(EduQuestionsTag  eduQuestionsTag){
		return eduQuestionsTagDao.findByList(eduQuestionsTag);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduQuestionsTag  findById(Long id){
			return eduQuestionsTagDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param eduQuestionsTag
	 * @return
	 */
	public Long findByCount(EduQuestionsTag  eduQuestionsTag){
		return eduQuestionsTagDao.findByCount(eduQuestionsTag);
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
		
	public PageInfo<EduQuestionsTag> findByPage(EduQuestionsTag eduQuestionsTag) {
		List<EduQuestionsTag> eduQuestionsTagList= eduQuestionsTagDao.findByList(eduQuestionsTag);
		//mybatis分页插件
		PageHelper.startPage(eduQuestionsTag.getPageNo(), eduQuestionsTag.getPageSize());
		PageInfo<EduQuestionsTag> pageInfo = new PageInfo<EduQuestionsTag>(eduQuestionsTagList);
        return pageInfo;
	}
	*/
}
