package com.company;

import java.util.HashMap;
import java.util.TreeSet;

import static java.lang.Math.round;

class Student implements Comparable<Student> {
    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    //! Getters
    public double getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }


    //! Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    // Override the compareTo() method
    public int compareTo(Student student)
    {
        return Double.compare(getGrade(), student.getGrade());
    }
}
