package com.cssrumi;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int value = 7;
//        value = value / 0;
        String[] texts = {"one", "two", "three"};
        try {
            System.out.println(texts[3]);
        } catch (RuntimeException e) {
            System.out.println(e.toString());
        }
    }
}
