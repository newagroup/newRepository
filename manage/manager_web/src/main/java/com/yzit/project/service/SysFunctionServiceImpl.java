package com.yzit.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yzit.project.entity.SysFunction;
import com.yzit.project.dao.SysFunctionDao;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
import com.yzit.common.core.text.Convert;

/**
 * 
 * <br>
 * <b>功能：</b>功能--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2018，云优众<br>
 */ 
@Service("sysFunctionService")
public class SysFunctionServiceImpl   implements SysFunctionService {
	//private final static Logger log= Logger.getLogger(SysFunctionService.class);
	
	@Autowired
	private SysFunctionDao  sysFunctionDao;

	/**
	 * 保持对象
	 * 
	 * @param sysFunction
	 */
	public int save(SysFunction  sysFunction){
		return	sysFunctionDao.save(sysFunction);
	}

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id){
		return sysFunctionDao.delById(id);
	}

	/**
	 * 修改对象
	 * 
	 * @param sysFunction
	 */
	public int update(SysFunction  sysFunction){
		return sysFunctionDao.update(sysFunction);
	}

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<SysFunction> findAll(){
		return sysFunctionDao.findAll();
	}

	/**
	 * 根据条件检索对象
	 * 
	 * @param sysFunction
	 * @return
	 */
	public List<SysFunction> findByList(SysFunction  sysFunction){
		return sysFunctionDao.findByList(sysFunction);
	}

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public SysFunction  findById(Long id){
			return sysFunctionDao.findById(id);
	}

	/**
	 * 检索总记录数
	 * 
	 * @param sysFunction
	 * @return
	 */
	public Long findByCount(SysFunction  sysFunction){
		return sysFunctionDao.findByCount(sysFunction);
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
		
	public PageInfo<SysFunction> findByPage(SysFunction sysFunction) {
		List<SysFunction> sysFunctionList= sysFunctionDao.findByList(sysFunction);
		//mybatis分页插件
		PageHelper.startPage(sysFunction.getPageNo(), sysFunction.getPageSize());
		PageInfo<SysFunction> pageInfo = new PageInfo<SysFunction>(sysFunctionList);
        return pageInfo;
	}
	*/
}
