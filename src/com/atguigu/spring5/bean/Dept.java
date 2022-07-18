package com.atguigu.spring5.bean;

/**
 * @author zhangweichen
 * @create 2022-07-18 10:39
 */
public class Dept {
    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
