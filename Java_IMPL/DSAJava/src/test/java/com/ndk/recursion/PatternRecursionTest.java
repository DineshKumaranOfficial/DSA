package com.ndk.recursion;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

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
}
