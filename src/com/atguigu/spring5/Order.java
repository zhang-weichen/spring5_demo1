package com.atguigu.spring5;

/**
 * @author zhangweichen
 * @create 2022-07-17 2:34
 */
public class Order {
    private String name;
    private String address;

    public Order(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void info() {
        System.out.println(name + "::" + address);
    }
}
