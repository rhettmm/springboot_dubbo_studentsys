package com.qf;

import java.util.List;

public interface IClassService {
    List<ClassInfo> list();

    /**
     * 根据班级ID查询班级信息
     * @param id
     * @return
     */
    ClassInfo selectClassById(Integer id);
}
