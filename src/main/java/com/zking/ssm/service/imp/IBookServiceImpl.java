package com.zking.ssm.service.imp;

import com.zking.ssm.mapper.BookMapper;
import com.zking.ssm.model.Book;
import com.zking.ssm.service.IBookService;
import com.zking.ssm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Service
public class IBookServiceImpl implements IBookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public int insert(Book record) {
        return 0;
    }

    @Override
    public List<Book> queryBookPager(Book book, PageBean pageBean) {
        return bookMapper.queryBookPager(book);
    }
}
