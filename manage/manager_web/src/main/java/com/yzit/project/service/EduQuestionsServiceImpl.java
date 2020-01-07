package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.EduQuestions;
import com.yzit.project.dao.EduQuestionsDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>问题--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("eduQuestionsService")
public class EduQuestionsServiceImpl   implements EduQuestionsService {
	//private final static Logger log= Logger.getLogger(EduQuestionsService.class);
	
	@Autowired
	private EduQuestionsDao  eduQuestionsDao;

	/**
	 * 保持对象
	 * 
	 * @param eduQuestions
	 */
	public int save(EduQuestions  eduQuestions){
		return	eduQuestionsDao.save(eduQuestions);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return eduQuestionsDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param eduQuestions
	 */
	public int update(EduQuestions  eduQuestions){
		return eduQuestionsDao.update(eduQuestions);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduQuestions> findAll(){
		return eduQuestionsDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduQuestions
	 * @return
	 */
	public List<EduQuestions> findByList(EduQuestions  eduQuestions){
		return eduQuestionsDao.findByList(eduQuestions);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduQuestions  findById(Long id){
			return eduQuestionsDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param eduQuestions
	 * @return
	 */
	public Long findByCount(EduQuestions  eduQuestions){
		return eduQuestionsDao.findByCount(eduQuestions);
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
		
	public PageInfo<EduQuestions> findByPage(EduQuestions eduQuestions) {
		List<EduQuestions> eduQuestionsList= eduQuestionsDao.findByList(eduQuestions);
		//mybatis分页插件
		PageHelper.startPage(eduQuestions.getPageNo(), eduQuestions.getPageSize());
		PageInfo<EduQuestions> pageInfo = new PageInfo<EduQuestions>(eduQuestionsList);
        return pageInfo;
	}
	*/
}
