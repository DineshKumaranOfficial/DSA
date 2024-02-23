package com.ndk.main;

import com.ndk.sorting.MergeSort;

public class Main {
    public static void main(String[] args) {
        Main mainCls = new Main();
        // MergeSort mergeSort = new MergeSort();
        // int[] arr = new int[]{3,5,1,1,4,9,7,6};
        // System.out.println("Before Sorting");
        // mainCls.printArr(arr);
        // System.out.println("After Sorting");
        // mergeSort.mergeSort(arr, 0, arr.length - 1);
        // mainCls.printArr(arr);
        mainCls.changeVal(0);
    }

    void printArr(int[] arr) {
        for (int val : arr) {
            System.out.printf("%d ", val);
        }
        System.out.println();
    }

    void changeVal(int idx) {
        System.out.println(idx + 1);
        System.out.println(idx + 1);
    }
}
