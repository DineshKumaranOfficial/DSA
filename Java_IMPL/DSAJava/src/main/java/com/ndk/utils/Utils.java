package com.ndk.utils;

public class Utils {
    public void printArr(int[] arr) {
        for (int val : arr) {
            System.out.printf("%d ", val);
        }
        System.out.println();
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
