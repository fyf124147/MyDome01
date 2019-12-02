package com.zking.fyf.service.impl;

import com.zking.fyf.mapper.NewsMapper;
import com.zking.fyf.model.News;
import com.zking.fyf.service.INewService;
import com.zking.fyf.vo.NewsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewServiceImpl implements INewService {
  @Autowired
  private NewsMapper newsMapper;
    @Override
    public News loadCasecode(News news) {
        return newsMapper.loadCasecode(news);
    }

    @Override
    public int addCategory(NewsVo newsVo) {
        return newsMapper.addCategory(newsVo) ;
    }

    @Override
    public int removeCategory(NewsVo newsVo) {

        return newsMapper.removeCategory(newsVo);
    }

    @Override
    public int del(News news) {
        newsMapper.deleteq(news);
        return newsMapper.deleteByPrimaryKey(news.getNewsId());
    }
}
