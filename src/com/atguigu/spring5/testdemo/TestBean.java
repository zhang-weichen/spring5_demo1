package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.bean.Emp;
import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangweichen
 * @create 2022-07-18 9:28
 */
public class TestBean {

    @Test
    public void testService() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
    @Test
    public void testEmp() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        Emp emp = context.getBean("emp", Emp.class);
        emp.info();
    }

    @Test
    public void testEmp1() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        Emp emp = context.getBean("emp", Emp.class);
        emp.info();
    }
}
