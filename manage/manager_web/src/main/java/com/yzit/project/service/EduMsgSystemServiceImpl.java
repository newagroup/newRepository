package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.EduMsgSystem;
import com.yzit.project.dao.EduMsgSystemDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>短信制度--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("eduMsgSystemService")
public class EduMsgSystemServiceImpl   implements EduMsgSystemService {
	//private final static Logger log= Logger.getLogger(EduMsgSystemService.class);
	
	@Autowired
	private EduMsgSystemDao  eduMsgSystemDao;

	/**
	 * 保持对象
	 * 
	 * @param eduMsgSystem
	 */
	public int save(EduMsgSystem  eduMsgSystem){
		return	eduMsgSystemDao.save(eduMsgSystem);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return eduMsgSystemDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param eduMsgSystem
	 */
	public int update(EduMsgSystem  eduMsgSystem){
		return eduMsgSystemDao.update(eduMsgSystem);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduMsgSystem> findAll(){
		return eduMsgSystemDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduMsgSystem
	 * @return
	 */
	public List<EduMsgSystem> findByList(EduMsgSystem  eduMsgSystem){
		return eduMsgSystemDao.findByList(eduMsgSystem);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduMsgSystem  findById(Long id){
			return eduMsgSystemDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param eduMsgSystem
	 * @return
	 */
	public Long findByCount(EduMsgSystem  eduMsgSystem){
		return eduMsgSystemDao.findByCount(eduMsgSystem);
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
		
	public PageInfo<EduMsgSystem> findByPage(EduMsgSystem eduMsgSystem) {
		List<EduMsgSystem> eduMsgSystemList= eduMsgSystemDao.findByList(eduMsgSystem);
		//mybatis分页插件
		PageHelper.startPage(eduMsgSystem.getPageNo(), eduMsgSystem.getPageSize());
		PageInfo<EduMsgSystem> pageInfo = new PageInfo<EduMsgSystem>(eduMsgSystemList);
        return pageInfo;
	}
	*/
}
