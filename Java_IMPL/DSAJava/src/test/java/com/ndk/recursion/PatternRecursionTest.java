package com.ndk.recursion;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import com.ndk.sorting.MergeSort;

public class PatternRecursionTest {
    @Test
    void testGetFibonacciNumber() {
        PatternRecursion patternRecursion = new PatternRecursion();
        // Eg: 0 1 1 2 3 5 8 13 21
        int result = patternRecursion.getFibonacciNumber(2);
        System.out.println(result);
    }

    @Test
    void testGetSubSeq() {
        PatternRecursion patternRecursion = new PatternRecursion();
        int[] arr = new int[] {3, 1, 2, 4};
        patternRecursion.getSubSeq(arr, new ArrayList<Integer>(), 0);
    }

    @Test
    void testPrintAllSubSeqWithSumK() {
        PatternRecursion patternRecursion = new PatternRecursion();
        int[] arr = new int[] {-1, 1, 3, 4, 6, 7, 8};
        int k = 7;
        patternRecursion.printAllSubSeqWithSumK(arr, k, new ArrayList<Integer>(), 0, 0);
    }

    @Test
    void testPrintOneSubSeqWithSumK() {
        PatternRecursion patternRecursion = new PatternRecursion();
        int[] arr = new int[] {1, 1, 3, 4, 6, 7, 8};
        int k = 10;
        patternRecursion.printOneSubSeqWithSumK(arr, k, new ArrayList<Integer>(), 0, 0);
    }

    @Test
    void testPrintAllCombWithSumK() {
        PatternRecursion patternRecursion = new PatternRecursion();
        int[] arr = new int[] {2, 3, 6, 7};
        int k = 9;
        patternRecursion.printAllCombWithSumK(arr, k, new ArrayList<Integer>(), 0);
    }

    @Test
    void testPrintAllUniqueCombWithSumK() {
        PatternRecursion patternRecursion = new PatternRecursion();
        int[] arr = new int[] {10, 1, 2, 7, 6, 1, 5};
        int k = 8;
        MergeSort sort = new MergeSort();
        sort.mergeSort(arr, 0, arr.length - 1);
        patternRecursion.printAllUniqueCombWithSumK(arr, k, new ArrayList<Integer>(), 0);
    }

    @Test
    void testFindAllSubsetSum() {
        PatternRecursion patternRecursion = new PatternRecursion();
        int[] arr = new int[] {3, 1, 2};
        ArrayList<Integer> result = new ArrayList<>();
        patternRecursion.findAllSubsetSum(arr, 0, 0, result);
        Collections.sort(result);
        System.out.println(result.toString());
    }

    @Test
    void testFindAllUniqueSubset() {
        PatternRecursion patternRecursion = new PatternRecursion();
        int[] arr = new int[] {1, 2, 2};
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        MergeSort sort = new MergeSort();
        sort.mergeSort(arr, 0, arr.length - 1);
        patternRecursion.findAllUniqueSubset(arr, 0, new ArrayList<Integer>(), result);
        System.out.println(result.toString());
    }

    @Test
    void testPrintAllPermutations() {
        PatternRecursion patternRecursion = new PatternRecursion();
        int[] arr = new int[] {1, 2, 3};
        patternRecursion.printAllPermutations(arr, 0);
    }
}
