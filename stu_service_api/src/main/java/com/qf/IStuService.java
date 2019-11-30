package com.qf;


import java.util.List;

public interface IStuService{
    List<Student> list();

    Student selectStuById(Integer id);

    /**
     * 根据ID选择性修改信息
     * @param student
     */
    int updateStudentSelectiveById(Student student);
}
