package com.thinking.eurekaclient.domain;

import java.util.List;

/**
 * @Author：caoj
 * @Description：
 * @Date：Created in 2018/9/26
 */
public class User {

    private String name;
    private Integer age;
    private String gender;
    private List<String> loves;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getLoves() {
        return loves;
    }

    public void setLoves(List<String> loves) {
        this.loves = loves;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", loves=" + loves +
                '}';
    }
}
