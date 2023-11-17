package arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestSubArray {
  public static void main(String args[]) {
    LongestSubArray longestSubArray = new LongestSubArray();
    int arr[] = new int[] {10, 5, 2, 7, 1, 9};
    int N = arr.length;
    int K = 15;
    System.out.println(longestSubArray.lenOfLongSubarr2(arr, N, K));
  }

  // This works for positive elements alone and not with both positive and negative elements
  public static int lenOfLongSubarr(int A[], int N, int K) {
    // Complete the function
    int i = 0;
    int j = 0;
    int length = 0;
    int sum = A[0];
    while (j < N) {
      while (i <= j && sum > K) {
        sum -= A[i];
        i++;
      }
      if (sum == K && j - i + 1 > length) {
        length = j - i + 1;
      }
      j++;
      if (j < N) {
        sum += A[j];
      }
    }
    return length;
  }

  public static int lenOfLongSubarr2(int arr[], int n, int k) {
    // Complete the function
    HashMap<Integer, Integer> sumMap = new HashMap<>();
    int sum = 0;
    int maxLen = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      if (sum == k) {
        maxLen = Integer.max(maxLen, i + 1);
      }
      if (sumMap.containsKey(sum - k)) {
        maxLen = Integer.max(maxLen, i - sumMap.get(sum - k));
      }
      if (!sumMap.containsKey(sum)) {
        sumMap.put(sum, i);
      }
    }
    return maxLen;
  }
}
