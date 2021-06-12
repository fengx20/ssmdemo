package com.fengx.ssm.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @description:
 * @author: 冯晓
 * @create: 2021-06-10
 **/
// lombok
@Data
// 注册为bean
@Component
public class TestEntity implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
}
