package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.EduArticle;
import com.yzit.project.dao.EduArticleDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>文章表--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("eduArticleService")
public class EduArticleServiceImpl   implements EduArticleService {
	//private final static Logger log= Logger.getLogger(EduArticleService.class);
	
	@Autowired
	private EduArticleDao  eduArticleDao;

	/**
	 * 保持对象
	 * 
	 * @param eduArticle
	 */
	public int save(EduArticle  eduArticle){
		return	eduArticleDao.save(eduArticle);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return eduArticleDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param eduArticle
	 */
	public int update(EduArticle  eduArticle){
		return eduArticleDao.update(eduArticle);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduArticle> findAll(){
		return eduArticleDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduArticle
	 * @return
	 */
	public List<EduArticle> findByList(EduArticle  eduArticle){
		return eduArticleDao.findByList(eduArticle);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduArticle  findById(Long id){
			return eduArticleDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param eduArticle
	 * @return
	 */
	public Long findByCount(EduArticle  eduArticle){
		return eduArticleDao.findByCount(eduArticle);
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
		
	public PageInfo<EduArticle> findByPage(EduArticle eduArticle) {
		List<EduArticle> eduArticleList= eduArticleDao.findByList(eduArticle);
		//mybatis分页插件
		PageHelper.startPage(eduArticle.getPageNo(), eduArticle.getPageSize());
		PageInfo<EduArticle> pageInfo = new PageInfo<EduArticle>(eduArticleList);
        return pageInfo;
	}
	*/
}
