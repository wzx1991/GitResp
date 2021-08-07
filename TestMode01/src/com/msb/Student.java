package com.msb;

/**
 * @author wengzx
 * @version :1.0
 * @date:2021/8/7- 08 - 07 - 12:24
 * @Description:com.msb
 */
public class Student {
    private int age;
    private double height ;
    private String name ;
    private String origin;
    private String apple ;


    public Student(int age, double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
