package com.qf;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseEntity implements Serializable {
    protected Integer id;
}
