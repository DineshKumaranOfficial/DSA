package arrays;

import java.util.HashSet;

public class ConsecSubSeq {
  public static void main(String args[]) {
    int arr[] = new int[] {2, 6, 1, 9, 4, 5, 3};
    int n = arr.length;
    System.out.println(findLongestConseqSubseq(arr, n));
  }

  static int findLongestConseqSubseq(int arr[], int n) {
    HashSet<Integer> uniqueSet = new HashSet<Integer>();
    int result = 0;
    for (int i = 0; i < n; i++) {
      uniqueSet.add(arr[i]);
    }
    for (int elem : uniqueSet) {
      int count = 1;
      int prevElem = elem - 1;
      if (!uniqueSet.contains(prevElem)) {
        int nextElem = elem + 1;
        while (uniqueSet.contains(nextElem)) {
          count++;
          nextElem = nextElem + 1;
        }
      }
      result = Integer.max(result, count);
    }

    return result;
  }
}
