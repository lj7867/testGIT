package com.zking.ssm.service.imp;

import com.zking.ssm.model.Category;
import com.zking.ssm.model.News;
import com.zking.ssm.service.ICategoryService;
import com.zking.ssm.service.ICustmoerService;
import com.zking.ssm.service.INewsService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class INewsServiceImpTest extends BaseTest{
    @Autowired
    private INewsService newsService;

    @Autowired
    private ICategoryService categoryService;

    @Test
    public void queryNewsLst() {
       /* List<News> news = newsService.queryNewsLst();
        for (News news1 : news) {
            System.out.println(news1);
        }*/
        Category category =new Category();
        category.setCategoryId(1);
        List<Category> categories = categoryService.querySingCate(category);
        for (Category category1 : categories) {
            System.out.println(category1);
        }
    }
}