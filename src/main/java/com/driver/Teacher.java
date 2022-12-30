package com.driver;

public class Teacher {

    private String name;

    private int numberOfStudents;

    private int age;

    public Teacher(String name,int numberOfStudents,int age) {
        this.age=age;
        this.name=name;
        this.numberOfStudents=numberOfStudents;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}