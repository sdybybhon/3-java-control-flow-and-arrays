package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {
        if (arr == null) {
            return;
        }
        if (arr.length == 0) {
            return;
        }

        int minIndex = 0;
        int minNum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minNum) {
                minNum = arr[i];
                minIndex = i;
            }
        }

        if (minIndex != 0) {
            int temp = arr[0];
            arr[0] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

}