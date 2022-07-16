package com.atguigu.spring5;

/**
 * @author zhangweichen
 * @create 2022-07-17 2:25
 */
public class Book {
    private String name;
    private String author;

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void info() {
        System.out.println(name + "::" + author);
    }
}
