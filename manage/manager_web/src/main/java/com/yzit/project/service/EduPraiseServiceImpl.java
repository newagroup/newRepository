package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.EduPraise;
import com.yzit.project.dao.EduPraiseDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>赞--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("eduPraiseService")
public class EduPraiseServiceImpl   implements EduPraiseService {
	//private final static Logger log= Logger.getLogger(EduPraiseService.class);
	
	@Autowired
	private EduPraiseDao  eduPraiseDao;

	/**
	 * 保持对象
	 * 
	 * @param eduPraise
	 */
	public int save(EduPraise  eduPraise){
		return	eduPraiseDao.save(eduPraise);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return eduPraiseDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param eduPraise
	 */
	public int update(EduPraise  eduPraise){
		return eduPraiseDao.update(eduPraise);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduPraise> findAll(){
		return eduPraiseDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduPraise
	 * @return
	 */
	public List<EduPraise> findByList(EduPraise  eduPraise){
		return eduPraiseDao.findByList(eduPraise);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduPraise  findById(Long id){
			return eduPraiseDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param eduPraise
	 * @return
	 */
	public Long findByCount(EduPraise  eduPraise){
		return eduPraiseDao.findByCount(eduPraise);
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
		
	public PageInfo<EduPraise> findByPage(EduPraise eduPraise) {
		List<EduPraise> eduPraiseList= eduPraiseDao.findByList(eduPraise);
		//mybatis分页插件
		PageHelper.startPage(eduPraise.getPageNo(), eduPraise.getPageSize());
		PageInfo<EduPraise> pageInfo = new PageInfo<EduPraise>(eduPraiseList);
        return pageInfo;
	}
	*/
}
