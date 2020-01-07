package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.EduQuestionsComment;
import com.yzit.project.dao.EduQuestionsCommentDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>问题意见和评论--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("eduQuestionsCommentService")
public class EduQuestionsCommentServiceImpl   implements EduQuestionsCommentService {
	//private final static Logger log= Logger.getLogger(EduQuestionsCommentService.class);
	
	@Autowired
	private EduQuestionsCommentDao  eduQuestionsCommentDao;

	/**
	 * 保持对象
	 * 
	 * @param eduQuestionsComment
	 */
	public int save(EduQuestionsComment  eduQuestionsComment){
		return	eduQuestionsCommentDao.save(eduQuestionsComment);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return eduQuestionsCommentDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param eduQuestionsComment
	 */
	public int update(EduQuestionsComment  eduQuestionsComment){
		return eduQuestionsCommentDao.update(eduQuestionsComment);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduQuestionsComment> findAll(){
		return eduQuestionsCommentDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduQuestionsComment
	 * @return
	 */
	public List<EduQuestionsComment> findByList(EduQuestionsComment  eduQuestionsComment){
		return eduQuestionsCommentDao.findByList(eduQuestionsComment);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduQuestionsComment  findById(Long id){
			return eduQuestionsCommentDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param eduQuestionsComment
	 * @return
	 */
	public Long findByCount(EduQuestionsComment  eduQuestionsComment){
		return eduQuestionsCommentDao.findByCount(eduQuestionsComment);
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
		
	public PageInfo<EduQuestionsComment> findByPage(EduQuestionsComment eduQuestionsComment) {
		List<EduQuestionsComment> eduQuestionsCommentList= eduQuestionsCommentDao.findByList(eduQuestionsComment);
		//mybatis分页插件
		PageHelper.startPage(eduQuestionsComment.getPageNo(), eduQuestionsComment.getPageSize());
		PageInfo<EduQuestionsComment> pageInfo = new PageInfo<EduQuestionsComment>(eduQuestionsCommentList);
        return pageInfo;
	}
	*/
}
