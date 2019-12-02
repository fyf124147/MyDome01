package com.zking.fyf.service;

import com.zking.fyf.mapper.NewsMapper;
import com.zking.fyf.model.News;
import com.zking.fyf.vo.NewsVo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class INewServiceTest extends BaseTestCase {
@Autowired
    private INewService newService;

    private NewsVo newsVo;

    private News news;

@Before
public  void before(){
    super.before();
    this.news = new News();
    this.newsVo = new NewsVo();
}


    @Test
    public void addCasecode() throws  Exception {
        newsVo.setNewsId(1);
        newsVo.setCategoryId(1);

        newService.addCategory(newsVo);
    }

    @Test
    public void removeCasecode() {
        newsVo.setNewsId(1);
        newsVo.setCategoryId(1);

        newService.removeCategory(newsVo);
    }
    @Test
    public void del() {
       newsVo.setNewsId(1);
        newService.del(newsVo);
    }

}