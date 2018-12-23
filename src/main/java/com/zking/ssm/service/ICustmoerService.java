package com.zking.ssm.service;

import com.zking.ssm.model.Custmoer;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ICustmoerService {

    List<Custmoer> queryCust();

}