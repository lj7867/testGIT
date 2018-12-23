package com.zking.ssm.model;

import lombok.ToString;

import java.io.Serializable;

@ToString
public class Book implements Serializable{
    private Integer id;

    private String bookName;

    private Float price;

    private String booktype;

    public Book(Integer id, String bookName, Float price, String booktype) {
        this.id = id;
        this.bookName = bookName;
        this.price = price;
        this.booktype = booktype;
    }

    public Book() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getBooktype() {
        return booktype;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }
}