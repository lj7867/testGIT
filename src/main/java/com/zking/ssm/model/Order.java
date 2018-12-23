package com.zking.ssm.model;

import lombok.ToString;

import java.io.Serializable;

@ToString
public class Order implements Serializable{
    private Integer orderId;

    private String orderNo;

    private Integer cid;

    private Custmoer custmoer;

    public Order(Integer orderId, String orderNo, Integer cid) {
        this.orderId = orderId;
        this.orderNo = orderNo;
        this.cid = cid;
    }

    public Order() {
        super();
    }

    public Custmoer getCustmoer() {
        return custmoer;
    }

    public void setCustmoer(Custmoer custmoer) {
        this.custmoer = custmoer;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
}