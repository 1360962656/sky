package com.sky.service.impl;

import com.sky.mapper.TestMapper;
import com.sky.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{

    @Autowired
    private TestMapper testMapper;

    @Override
    public String selectTest(int id){
        return testMapper.TestSelect(id);
    }
}
