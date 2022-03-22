package com.company;

import java.util.List;

public class MyList<T> {
    List<T> list_of_elements;
    private int dimension;

    public MyList(List<T> list_of_elements, int dimension) {
        this.list_of_elements = list_of_elements;
        this.dimension = dimension;
    }

    public void add(T element) {
        list_of_elements.add(element);
    }

    public void print() {
        for (T element : list_of_elements)
            System.out.println(element);
    }

    public boolean lookup(T element) {
        return list_of_elements.contains(element);
    }
}
