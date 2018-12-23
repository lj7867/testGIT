package com.zking.ssm.service.imp;

import com.zking.ssm.model.Custmoer;
import com.zking.ssm.model.Order;
import com.zking.ssm.service.ICustmoerService;
import com.zking.ssm.service.IOrderService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class ICustmoerServiceImpTest extends BaseTest{

    @Autowired
    private ICustmoerService custmoerService;

    @Autowired
    private IOrderService orderService;

    @Test
    public void test(){
       /* List<Custmoer> custmoers = custmoerService.queryCust();
        for (Custmoer custmoer : custmoers) {
            System.out.println(custmoer);
        }
*/
        Order order = orderService.querySimgle(1);
        System.out.println(order);


    }

}