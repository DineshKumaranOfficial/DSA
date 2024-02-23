package com.ndk.recursion;

public class BasicRecursion {
    // Basic parameterized recursion for generating 1 to n numbers
    void oneToN(int start, int n) {
        if (start > n) {
            return;
        }
        System.out.println(start);
        oneToN(start + 1, n);
    }

    // Basic parameterized recursion for generating 1 to n numbers using backtracking
    void oneToNBacktracking(int n) {
        if (n < 1) {
            return;
        }
        oneToNBacktracking(n - 1);
        System.out.println(n);
    }

    // Basic functional recursion for finding sum of n positive numbers
    int sumOfN(int n) {
        if (n < 1) {
            return 0;
        }
        return n + sumOfN(n - 1);
    }

    // Basic functional recursion to find factorial of a number
    int factorial(int n) {
        if (n < 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Array reversal using parameterized recursion
    void arrReversal(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        arrReversal(arr, start + 1, end - 1);
    }

    // Palindrome Check of an array
    boolean isPalindrome(int[] arr, int start) {
        if (start >= arr.length / 2) {
            return true;
        }
        return arr[start] == arr[arr.length - start - 1] && isPalindrome(arr, start + 1);
    }
}
