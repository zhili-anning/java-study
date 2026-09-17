package com.study.entity;

public class Student {
    private  String name;
    private  int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void study() {
        System.out.println(name + "在学习");
    }

    public void eat(){
        System.out.println(name + "在吃饭");
    }

    public void sleep(){
        System.out.println(name + "在睡觉");
    }
}
