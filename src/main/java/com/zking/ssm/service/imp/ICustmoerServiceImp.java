package com.zking.ssm.service.imp;

import com.zking.ssm.mapper.CustmoerMapper;
import com.zking.ssm.model.Custmoer;
import com.zking.ssm.service.ICustmoerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Service
public class ICustmoerServiceImp implements ICustmoerService {

    @Resource(name = "custMapper")
    private CustmoerMapper custmoerMapper;

    @Override
    public List<Custmoer> queryCust() {
        return custmoerMapper.queryCust();
    }
}
