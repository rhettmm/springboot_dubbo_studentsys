package com.qf;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName("cclass")
public class ClassInfo extends BaseEntity {
    /**
     * 班级名称
     */
    private String cname;
    /**
     * 班级人数
     */
    @TableField("people")
    private Integer studentSum;
}
