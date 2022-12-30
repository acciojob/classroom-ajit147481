package com.driver;

public class Student {

    private String name;
    private int age;
    private double averageScore;

    public Student(String name,int age,double averageScore){
        this.age=age;
        this.name=name;
        this.averageScore=averageScore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public int getAge() {
        return age;
    }
}
