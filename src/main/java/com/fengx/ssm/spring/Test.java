package com.fengx.ssm.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Fengx
 * @date: 2021-09-15
 * @description:
 **/
public class Test {

    public static void main(String[] args) {
        // 创建一个Spring的IoC容器实例，然后加载配置文件，让Spring容器为我们创建并装配好配置文件中指定的所有Bean
        // Spring容器就是ApplicationContext，它是一个接口，有很多实现类，这里我们选择ClassPathXmlApplicationContext，
        // 表示它会自动从classpath中查找指定的XML配置文件
        // 获得了ApplicationContext的实例，就获得了IoC容器的引用
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        // 获取bean
        UserService userService = context.getBean(UserService.class);
        // 正常调用
        User user = userService.login("bob@example.com", "password");
        System.out.println(user.getName());
    }
}
