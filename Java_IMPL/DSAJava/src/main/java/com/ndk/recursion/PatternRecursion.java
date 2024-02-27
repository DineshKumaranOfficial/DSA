package com.ndk.recursion;

import java.util.ArrayList;
import com.ndk.utils.Utils;

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

    // Print All Combinations of the array whose sum is equal to K. Each element can be taken
    // multiple times
    void printAllCombWithSumK(int[] arr, int k, ArrayList<Integer> combination, int idx) {
        if (k == 0) {
            System.out.println(combination.toString());
            return;
        }
        if (idx >= arr.length) {
            return;
        }
        if (arr[idx] > k)
            return;
        combination.add(arr[idx]);
        printAllCombWithSumK(arr, k - arr[idx], combination, idx);
        combination.remove(combination.size() - 1);
        printAllCombWithSumK(arr, k, combination, idx + 1);
    }

    // Print all unique combinations of the array whose sum is equal to K. Each element can be taken
    // only once. Output should be in lexigraphic ascending order. Before calling this recursion
    // method make sure the input array is sorted
    void printAllUniqueCombWithSumK(int arr[], int k, ArrayList<Integer> combination, int idx) {
        if (k == 0) {
            System.out.println(combination.toString());
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1])
                continue;
            if (arr[i] > k)
                break;
            combination.add(arr[i]);
            printAllUniqueCombWithSumK(arr, k - arr[i], combination, i + 1);
            combination.remove(combination.size() - 1);
        }
    }

    // Print all subset sum of an array
    // Subset is same as subsequence
    void findAllSubsetSum(int[] arr, int idx, int sum, ArrayList<Integer> result) {
        if (idx >= arr.length) {
            result.add(sum);
            return;
        }
        findAllSubsetSum(arr, idx + 1, sum + arr[idx], result);
        findAllSubsetSum(arr, idx + 1, sum, result);
    }

    // Print all unique subset of an array
    void findAllUniqueSubset(int[] arr, int idx, ArrayList<Integer> subset,
            ArrayList<ArrayList<Integer>> result) {
        result.add(new ArrayList<>(subset));
        for (int i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1])
                continue;
            subset.add(arr[i]);
            findAllUniqueSubset(arr, i + 1, subset, result);
            subset.remove(subset.size() - 1);
        }
    }

    // Print all permutations of an array
    // Permutation is the rearranging of elements in possible combinations in an array
    void printAllPermutations(int[] arr, int idx) {
        Utils utils = new Utils();
        if (idx >= arr.length) {
            utils.printArr(arr);
        }
        for (int i = idx; i < arr.length; i++) {
            utils.swap(arr, idx, i);
            printAllPermutations(arr, idx + 1);
            utils.swap(arr, idx, i);
        }
    }
}
