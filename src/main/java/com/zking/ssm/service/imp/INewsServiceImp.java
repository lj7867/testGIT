package com.zking.ssm.service.imp;

import com.zking.ssm.mapper.NewsMapper;
import com.zking.ssm.model.News;
import com.zking.ssm.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class INewsServiceImp implements INewsService {
    @Autowired
    private NewsMapper newsMapper;


    @Override
    public List<News> queryNewsLst() {
        return newsMapper.queryNewsLst();
    }
}
