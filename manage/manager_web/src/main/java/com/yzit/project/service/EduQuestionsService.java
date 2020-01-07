package com.yzit.project.service;
import java.util.List;
import com.yzit.project.entity.EduQuestions;
//import com.github.pagehelper.PageInfo;
/**
 * 
 * <br>
 * <b>功能：</b>问题--服务实现类<br>
 * <b>作者：</b>86157<br>
 * <b>日期：</b> 2020-01-07 <br>
 * <b>版权所有： 2019，云优众<br>
 */ 
public interface EduQuestionsService {
	/**
	 * 保持对象
	 * 
	 * @param eduQuestions
	 */
	public int save(EduQuestions  eduQuestions);

	/**
	 * 根据id删除对象
	 * 
	 * @param id
	 */
	public int delById(Long id);

	/**
	 * 修改对象
	 * 
	 * @param eduQuestions
	 */
	public int  update(EduQuestions  eduQuestions);

	/**
	 * 检索所有的对象
	 * 
	 * @return
	 */
	public List<EduQuestions> findAll();

	/**
	 * 根据条件检索对象
	 * 
	 * @param eduQuestions
	 * @return
	 */
	public List<EduQuestions> findByList(EduQuestions  eduQuestions);

	/**
	 * 根据id检索对象
	 * 
	 * @param id
	 * @return
	 */
	public EduQuestions  findById(Long id);

	/**
	 * 检索总记录数
	 * 
	 * @param eduQuestions
	 * @return
	 */
	public Long findByCount(EduQuestions  eduQuestions);
	
	/**
     * 批量删除信息
     * 
     * @param ids 需要删除的ID集合
     * @return 结果
     */
    public int delByIds(String ids) ;
	/**
	 * 分页检索数据
	 * @param admDept
	 * @return
	 */
	//public PageInfo<EduQuestions> findByPage(EduQuestions  eduQuestions);
}