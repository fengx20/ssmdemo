package com.fengx.ssm.mapper;

import com.fengx.ssm.entity.TestEntity;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: 冯晓
 * @create: 2021-06-10
 **/
// 注册为持久层的bean
@Repository
public interface TestMapper {

    /**
     * 查询数据库信息
     * @return
     */
    TestEntity getData();
}
