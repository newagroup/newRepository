package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.SysSubject;
import com.yzit.project.dao.SysSubjectDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>科目--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("sysSubjectService")
public class SysSubjectServiceImpl   implements SysSubjectService {
	//private final static Logger log= Logger.getLogger(SysSubjectService.class);
	
	@Autowired
	private SysSubjectDao  sysSubjectDao;

	/**
	 * 保持对象
	 * 
	 * @param sysSubject
	 */
	public int save(SysSubject  sysSubject){
		return	sysSubjectDao.save(sysSubject);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return sysSubjectDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param sysSubject
	 */
	public int update(SysSubject  sysSubject){
		return sysSubjectDao.update(sysSubject);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<SysSubject> findAll(){
		return sysSubjectDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param sysSubject
	 * @return
	 */
	public List<SysSubject> findByList(SysSubject  sysSubject){
		return sysSubjectDao.findByList(sysSubject);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public SysSubject  findById(Long id){
			return sysSubjectDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param sysSubject
	 * @return
	 */
	public Long findByCount(SysSubject  sysSubject){
		return sysSubjectDao.findByCount(sysSubject);
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
		
	public PageInfo<SysSubject> findByPage(SysSubject sysSubject) {
		List<SysSubject> sysSubjectList= sysSubjectDao.findByList(sysSubject);
		//mybatis分页插件
		PageHelper.startPage(sysSubject.getPageNo(), sysSubject.getPageSize());
		PageInfo<SysSubject> pageInfo = new PageInfo<SysSubject>(sysSubjectList);
        return pageInfo;
	}
	*/
}
