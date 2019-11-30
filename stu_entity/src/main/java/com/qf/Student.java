package com.qf;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.TreeMap;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Student extends BaseEntity{
    /**
     * 姓名
     */
    private String sname;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 班级编号
     */
    private Integer cid;
    /**
     * 所在班级信息
     */
    @TableField(exist = false)
    private ClassInfo classInfo;


}
