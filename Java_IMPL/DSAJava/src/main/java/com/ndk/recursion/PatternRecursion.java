package com.ndk.recursion;

import java.util.ArrayList;

public class PatternRecursion {
    // Program to get the nth fibonaaci number. Time Complexity is 2^n
    // Eg: 0 1 1 2 3 5 8 13 21
    int getFibonacciNumber(int n) {
        if (n <= 1) {
            return n;
        }
        int left = getFibonacciNumber(n - 1);
        int right = getFibonacciNumber(n - 2);
        return left + right;
    }

    // Program to print all subsequences of an array
    void getSubSeq(int[] arr, ArrayList<Integer> subSeqArr, int idx) {
        // System.out.println("Current Index is:" + idx);
        if (idx >= arr.length) {
            System.out.println(subSeqArr.toString());
            return;
        }
        subSeqArr.add(arr[idx]);
        getSubSeq(arr, subSeqArr, idx + 1);
        subSeqArr.remove(subSeqArr.size() - 1);
        getSubSeq(arr, subSeqArr, idx + 1);
    }

    // Printing all subsequences with Sum equal to K
    void printAllSubSeqWithSumK(int[] arr, int k, ArrayList<Integer> subSeq, int idx, int sum) {
        if (idx >= arr.length) {
            if (sum > k) {
                return;
            }
            if (sum == k) {
                System.out.println(subSeq.toString());
            }
            return;
        }
        subSeq.add(arr[idx]);
        sum += arr[idx];
        printAllSubSeqWithSumK(arr, k, subSeq, idx + 1, sum);
        subSeq.remove(subSeq.size() - 1);
        sum -= arr[idx];
        printAllSubSeqWithSumK(arr, k, subSeq, idx + 1, sum);
    }

    // Printing one subsequence with sum equal to K
    boolean printOneSubSeqWithSumK(int[] arr, int k, ArrayList<Integer> subSeq, int idx, int sum) {
        if (sum > k) {
            return false;
        }
        if (idx >= arr.length) {
            if (sum == k) {
                System.out.println(subSeq.toString());
                return true;
            }
            return false;
        }
        subSeq.add(arr[idx]);
        sum += arr[idx];
        boolean leftResult = printOneSubSeqWithSumK(arr, k, subSeq, idx + 1, sum);
        boolean rightResult = false;
        if (!leftResult) {
            subSeq.remove(subSeq.size() - 1);
            sum -= arr[idx];
            rightResult = printOneSubSeqWithSumK(arr, k, subSeq, idx + 1, sum);
        }
        return leftResult || rightResult;
    }
}
