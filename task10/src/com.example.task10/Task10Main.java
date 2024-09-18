package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        int[] arr = {312, 2, 321312321};
        System.out.println(numMin(arr));
    }

    static int numMin(int[] arr) {
        int minIndex = 0;
        int minNum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= minNum) {
                minNum = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

}