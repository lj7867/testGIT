package com.zking.ssm.util;

import org.apache.ibatis.cache.Cache;

import java.util.concurrent.locks.ReadWriteLock;

public class test{
    public static void main(String[] args) {
        t(1237);
    }

    public static void t(int n){
        if(n>5000)
            return;
        System.out.println(n);
        t(n*2);
        System.out.println(n);
    }

}
