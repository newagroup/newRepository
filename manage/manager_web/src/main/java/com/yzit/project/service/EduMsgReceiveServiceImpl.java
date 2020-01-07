package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.EduMsgReceive;
import com.yzit.project.dao.EduMsgReceiveDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>接受的短信--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("eduMsgReceiveService")
public class EduMsgReceiveServiceImpl   implements EduMsgReceiveService {
	//private final static Logger log= Logger.getLogger(EduMsgReceiveService.class);
	
	@Autowired
	private EduMsgReceiveDao  eduMsgReceiveDao;

	/**
	 * 保持对象
	 * 
	 * @param eduMsgReceive
	 */
	public int save(EduMsgReceive  eduMsgReceive){
		return	eduMsgReceiveDao.save(eduMsgReceive);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return eduMsgReceiveDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param eduMsgReceive
	 */
	public int update(EduMsgReceive  eduMsgReceive){
		return eduMsgReceiveDao.update(eduMsgReceive);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduMsgReceive> findAll(){
		return eduMsgReceiveDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduMsgReceive
	 * @return
	 */
	public List<EduMsgReceive> findByList(EduMsgReceive  eduMsgReceive){
		return eduMsgReceiveDao.findByList(eduMsgReceive);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduMsgReceive  findById(Long id){
			return eduMsgReceiveDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param eduMsgReceive
	 * @return
	 */
	public Long findByCount(EduMsgReceive  eduMsgReceive){
		return eduMsgReceiveDao.findByCount(eduMsgReceive);
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
		
	public PageInfo<EduMsgReceive> findByPage(EduMsgReceive eduMsgReceive) {
		List<EduMsgReceive> eduMsgReceiveList= eduMsgReceiveDao.findByList(eduMsgReceive);
		//mybatis分页插件
		PageHelper.startPage(eduMsgReceive.getPageNo(), eduMsgReceive.getPageSize());
		PageInfo<EduMsgReceive> pageInfo = new PageInfo<EduMsgReceive>(eduMsgReceiveList);
        return pageInfo;
	}
	*/
}
