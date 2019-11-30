package com.qf.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.ClassInfo;
import com.qf.IClassService;
import com.qf.dao.ClassInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ClassService implements IClassService {

    @Autowired
    private ClassInfoMapper classInfoMapper;

    @Override
    public List<ClassInfo> list() {
        return classInfoMapper.selectList(null);
    }

    @Override
    public ClassInfo selectClassById(Integer id) {
        return classInfoMapper.selectById(id);
    }
}
