package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        System.out.println(getMax(321, 321312312, 1, 321312));
    }

    static int getMax(int a, int b, int c, int d) {
        return Math.max(Math.max(Math.max(a, b), c), d);
    }

}