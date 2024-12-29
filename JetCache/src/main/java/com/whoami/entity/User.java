package com.whoami.entity;

import java.io.Serializable;

/**
 * @ Author：enrl
 * @ Date：2024-12-28-20:35
 * @ Version：1.0
 * @ Description：测试实体类
 */
public class User implements Serializable {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User builder(String name, Integer age) {
        this.name = name;
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
