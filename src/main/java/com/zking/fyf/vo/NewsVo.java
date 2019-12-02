package com.zking.fyf.vo;

import com.zking.fyf.model.News;
import lombok.Data;

@Data
public class NewsVo extends News {
    private Integer categoryId;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}
