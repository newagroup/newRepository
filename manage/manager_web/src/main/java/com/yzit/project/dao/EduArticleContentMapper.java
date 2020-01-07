package com.yzit.project.dao;

import com.yzit.project.entity.EduArticleContent;
import com.yzit.project.entity.EduArticleContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EduArticleContentMapper {
    int countByExample(EduArticleContentExample example);

    int deleteByExample(EduArticleContentExample example);

    int insert(EduArticleContent record);

    int insertSelective(EduArticleContent record);

    List<EduArticleContent> selectByExampleWithBLOBs(EduArticleContentExample example);

    List<EduArticleContent> selectByExample(EduArticleContentExample example);

    int updateByExampleSelective(@Param("record") EduArticleContent record, @Param("example") EduArticleContentExample example);

    int updateByExampleWithBLOBs(@Param("record") EduArticleContent record, @Param("example") EduArticleContentExample example);

    int updateByExample(@Param("record") EduArticleContent record, @Param("example") EduArticleContentExample example);
}