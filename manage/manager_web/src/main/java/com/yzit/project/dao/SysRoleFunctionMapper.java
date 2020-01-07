package com.yzit.project.dao;

import com.yzit.project.entity.SysRoleFunction;
import com.yzit.project.entity.SysRoleFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleFunctionMapper {
    int countByExample(SysRoleFunctionExample example);

    int deleteByExample(SysRoleFunctionExample example);

    int insert(SysRoleFunction record);

    int insertSelective(SysRoleFunction record);

    List<SysRoleFunction> selectByExample(SysRoleFunctionExample example);

    int updateByExampleSelective(@Param("record") SysRoleFunction record, @Param("example") SysRoleFunctionExample example);

    int updateByExample(@Param("record") SysRoleFunction record, @Param("example") SysRoleFunctionExample example);
}