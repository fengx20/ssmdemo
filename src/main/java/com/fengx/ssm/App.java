package com.fengx.ssm;

import com.fengx.ssm.entity.TestEntity;
import com.fengx.ssm.mapper.TestMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @description:
 * @author: 冯晓
 * @create: 2021-06-12
 **/
// 使用spring5的测试
@SpringJUnitConfig(locations = "file:spring-config.xml")
public class App {
    @Autowired
    private TestMapper testMapper;

    @Test
    void getData1() throws Exception{
        TestEntity data = testMapper.getData();
        System.out.println(data);
    }
}
