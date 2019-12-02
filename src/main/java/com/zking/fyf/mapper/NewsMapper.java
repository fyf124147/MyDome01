package com.zking.fyf.mapper;

import com.zking.fyf.model.News;
import com.zking.fyf.vo.NewsVo;

public interface NewsMapper {
    int deleteByPrimaryKey(Integer newsId);
    int deleteq(News news);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer newsId);

    News loadCasecode(News record);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);

    int addCategory(NewsVo newsVo);

    int removeCategory(NewsVo newsVo);

    int del(News news);
}