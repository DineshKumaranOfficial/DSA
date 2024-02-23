package com.ndk.recursion;

import org.junit.jupiter.api.Test;

public class BasicRecursionTest {
    @Test
    void testOneToN() {
        BasicRecursion basicRecursion = new BasicRecursion();
        int n = 6;
        basicRecursion.oneToN(1, n);
    }

    @Test
    void testOneToNBacktracking() {
        BasicRecursion basicRecursion = new BasicRecursion();
        int n = 5;
        basicRecursion.oneToNBacktracking(n);
    }

    @Test
    void testSumOfN() {
        BasicRecursion basicRecursion = new BasicRecursion();
        int n = 5;
        int sum = basicRecursion.sumOfN(n);
        System.out.println(sum);
    }

    @Test
    void testFactorial() {
        BasicRecursion basicRecursion = new BasicRecursion();
        int n = 5;
        int fact = basicRecursion.factorial(n);
        System.out.println(fact);
    }

    @Test
    void testArrReversal() {
        BasicRecursion basicRecursion = new BasicRecursion();
        int arr[] = new int[] {1, 2, 3, 4, 5, 6};
        basicRecursion.arrReversal(arr, 0, arr.length - 1);
        printArr(arr);
    }

    void printArr(int[] arr) {
        for (int val : arr) {
            System.out.printf("%d ", val);
        }
        System.out.println();
    }

    @Test
    void testIsPalindrome() {
        BasicRecursion basicRecursion = new BasicRecursion();
        int arr[] = new int[] {1, 2, 3, 3, 2, 1};
        System.out.println("Is the given array Palindrome?");
        System.out.println(basicRecursion.isPalindrome(arr, 0));
    }
}
