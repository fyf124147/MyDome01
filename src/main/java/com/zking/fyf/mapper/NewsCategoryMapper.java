package com.zking.fyf.mapper;

import com.zking.fyf.model.NewsCategory;

public interface NewsCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NewsCategory record);

    int insertSelective(NewsCategory record);

    NewsCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NewsCategory record);

    int updateByPrimaryKey(NewsCategory record);
}