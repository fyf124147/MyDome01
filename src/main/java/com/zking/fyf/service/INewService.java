package com.zking.fyf.service;

import com.zking.fyf.model.News;
import com.zking.fyf.vo.NewsVo;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface INewService {
    @Transactional(readOnly = true)
    News loadCasecode(News news);

    int addCategory(NewsVo newsVo);

    int removeCategory(NewsVo newsVo);

    int del(News news);
}
