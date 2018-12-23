package com.zking.ssm.mapper;

import com.zking.ssm.model.Custmoer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "custMapper")
public interface CustmoerMapper {

    List<Custmoer> queryCust();

}