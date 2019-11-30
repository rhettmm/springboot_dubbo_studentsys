package com.qf.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qf.IStuService;
import com.qf.Student;
import com.qf.dao.StuMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class StuServiceImpl implements IStuService {

    @Autowired
    private StuMapper stuMapper;

    /**
     * 查询所有学生信息
     * @return
     */
    @Override
    public List<Student> list() {
        List<Student> studentList = stuMapper.selectList(null);

        return studentList;
    }

    /**
     * 根据ID查询学生信息
     * @param id
     * @return
     */
    @Override
    public Student selectStuById(Integer id) {
//        QueryWrapper wrapper=new QueryWrapper();
//        wrapper.eq("id",id);
        return stuMapper.selectById(id);
    }

    /**
     * 根据ID选择性修改学生信息
     * @param student
     * @return
     */
    @Override
    public int updateStudentSelectiveById(Student student) {
        return stuMapper.updateById(student);
    }
}
