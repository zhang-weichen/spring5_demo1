package com.atguigu.spring5.bean;

/**
 * @author zhangweichen
 * @create 2022-07-18 10:39
 */
public class Emp {
    private String ename;
    private String gender;
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void info() {
        System.out.println(ename + "::" + gender + "::" + dept);
    }

}
