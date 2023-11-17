package arrays;

public class NonRepeatingElem {
  public static void main(String args[]) {
    NonRepeatingElem elem = new NonRepeatingElem();
    int arr[] = new int[] {-1, -17, -12, 8, 16, -17, -13, -14, -3, -6, -5, -11, -10, -12, -5, 19,
        -17, -5, -1, 12};
    int size = arr.length;
    System.out.println(elem.firstNonRepeating(arr, size));
  }

  public int firstNonRepeating(int arr[], int n) {
    // Complete the function
    int result = 0;
    for (int i = 0; i < n; i++) {
      result = result ^ arr[i];
    }
    return result;
  }
}
