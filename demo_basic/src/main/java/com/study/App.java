package com.study;

import com.study.entity.Student;

/**
 * 测试类
 *
 */
public class App 
{
    public static void main( String[] args ){
        Student s1 = new Student();
        s1.setName("zahngsan");
        s1.setAge(19);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        s1.study();
        s1.eat();
        s1.sleep();

        Student s2 = new Student("lizhi",18);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        s2.sleep();
        s2.eat();
        s2.study();
    }
}
