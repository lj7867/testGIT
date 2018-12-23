package com.zking.ssm.service.imp;

import com.zking.ssm.model.Book;
import com.zking.ssm.service.IBookService;
import com.zking.ssm.util.PageBean;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class IBookServiceImplTest extends BaseTest{
    @Autowired
    private IBookService bookService;

    @Before
    public void setUp() {
        super.setUp();
    }

    @Test
    public void queryBookPager() {
        PageBean pageBean = new PageBean();
        pageBean.setRows(5);
        List<Book> books = bookService.queryBookPager(book, pageBean);
        for (Book book1 : books) {
            System.out.println(book1);
        }
        System.out.println("========================");
        List<Book> books2 = bookService.queryBookPager(book, pageBean);
        for (Book book1 : books2) {
            System.out.println(book1);
        }

    }
}