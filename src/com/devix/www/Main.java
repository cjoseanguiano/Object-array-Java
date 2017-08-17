package com.devix.www;

public class Main {

    public static void main(String[] args) {

        String[] values = {"cat", "dog", "rabbit"};
        Object[] array = values;

        for (Object v : array) {
//            System.out.println(((String) v).length());
            System.out.println(v.toString().length());
        }
    }
}
