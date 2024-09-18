package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        int[] arr = {321, 2, 5, 21, 21312, 322};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        if (arr == null) {
            return;
        }
        if (arr.length == 0) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}