package com.company;

import java.util.HashMap;
import java.util.TreeSet;

import static java.lang.Math.round;

public class Student extends TreeSet<Student> {
    private String name;
    private int grade;
    private HashMap<Integer, TreeSet<Student>> studentsGrade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public void addStudent(Student student) {
        studentsGrade.put(round(student.getGrade()), student);
    }

    public int getGrade() {
        return grade;
    }
}
