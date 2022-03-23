package com.company;

import com.sun.source.tree.Tree;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //! Populate students set
        TreeSet<Student> studentsSet = new TreeSet<Student>();

        Student s1 = new Student("Jim", 8.2);
        Student s2 = new Student("Tom", 6.4);
        Student s3 = new Student("Bill", 5.3);
        Student s4 = new Student("Bob", 9.5);
        Student s5 = new Student("Kim", 10);

        studentsSet.add(s1);
        studentsSet.add(s2);
        studentsSet.add(s3);
        studentsSet.add(s4);
        studentsSet.add(s5);

        //! testing

//        for (Student student : studentsSet) {
//            System.out.println(student);
//        }

        //! Students Map with TreeSets
        Map<Integer, TreeSet<Student>> studentsMap = new HashMap<>();

         for (int index = 10; index >= 0; index--) {
             TreeSet<Student> indexStudentsGrade = new TreeSet<>();
             for (Student student : studentsSet) {
                 if (Math.round(student.getGrade()) == index) {
                     indexStudentsGrade.add(student);
                 }
             }

             //! Descending order
             TreeSet<Student> result = (TreeSet<Student>)indexStudentsGrade.descendingSet();
             studentsMap.put(index, result);
         }

        System.out.println(studentsMap);


        //! MyList of Generics
//        List<String> names = new ArrayList<>();
//        names.add("andrei");
//        names.add("cip");
//        names.add("dan");
//        String randomName = "Jim";
//        MyList list = new MyList<>(names, 3);
//        list.print();
//        System.out.println(list.lookup(randomName));;
    }


}
