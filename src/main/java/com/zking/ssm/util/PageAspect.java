package com.zking.ssm.util;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class PageAspect {
    @Around("execution(* *..*Service.*Pager(..))")
    public Object invoke(ProceedingJoinPoint args) throws Throwable {
        Object[] args1 = args.getArgs();
        PageBean pageBean = null;
        for (Object o : args1) {
            if(o instanceof PageBean){
                pageBean = (PageBean)o;
                break;
            }
        }
        if(null!=pageBean && pageBean.isPagination()){
            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        }
        Object result = args.proceed(args1);
        if(null!=pageBean && pageBean.isPagination()){
            List list = (List)result;
            PageInfo pageInfo = new PageInfo(list);
        }
        return result;
    }

}
