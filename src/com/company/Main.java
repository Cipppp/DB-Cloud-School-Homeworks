package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //! Students Map with TreeSets



        //! MyList of Generics
        List<String> names = new ArrayList<>();
        names.add("andrei");
        names.add("cip");
        names.add("dan");
        String randomName = "Jim";
        MyList list = new MyList<>(names, 3);
        list.print();
        System.out.println(list.lookup(randomName));;
    }
}
