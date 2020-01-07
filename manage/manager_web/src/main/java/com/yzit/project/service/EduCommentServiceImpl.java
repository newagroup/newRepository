package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.EduComment;
import com.yzit.project.dao.EduCommentDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>文章评论表--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("eduCommentService")
public class EduCommentServiceImpl   implements EduCommentService {
	//private final static Logger log= Logger.getLogger(EduCommentService.class);
	
	@Autowired
	private EduCommentDao  eduCommentDao;

	/**
	 * 保持对象
	 * 
	 * @param eduComment
	 */
	public int save(EduComment  eduComment){
		return	eduCommentDao.save(eduComment);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return eduCommentDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param eduComment
	 */
	public int update(EduComment  eduComment){
		return eduCommentDao.update(eduComment);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduComment> findAll(){
		return eduCommentDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduComment
	 * @return
	 */
	public List<EduComment> findByList(EduComment  eduComment){
		return eduCommentDao.findByList(eduComment);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduComment  findById(Long id){
			return eduCommentDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param eduComment
	 * @return
	 */
	public Long findByCount(EduComment  eduComment){
		return eduCommentDao.findByCount(eduComment);
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
		
	public PageInfo<EduComment> findByPage(EduComment eduComment) {
		List<EduComment> eduCommentList= eduCommentDao.findByList(eduComment);
		//mybatis分页插件
		PageHelper.startPage(eduComment.getPageNo(), eduComment.getPageSize());
		PageInfo<EduComment> pageInfo = new PageInfo<EduComment>(eduCommentList);
        return pageInfo;
	}
	*/
}
