package arrays;

public class Rotate {
  public static void main(String args[]) {
    Rotate rotate = new Rotate();
    int[] arr = new int[] {1, 2, 3, 4, 5};
    int d = 2;
    int n = arr.length;
    System.out.println("Input:");
    for (int i = 0; i < arr.length; i++) {
      System.out.printf("%d ", arr[i]);
    }
    System.out.println();
    System.out.printf("After left rotate by %d places", d);
    System.out.println();
    rotate.leftRotate(arr, d, n);
    System.out.println("Output:");
    for (int i = 0; i < arr.length; i++) {
      System.out.printf("%d ", arr[i]);
    }
  }

  public void leftRotate(int[] arr, int d, int n) {
    d = d % n;
    System.out.println("d is now " + d);
    if (d == 0) {
      return;
    } else {
      reverse(arr, 0, d - 1);
      reverse(arr, d, n - 1);
      reverse(arr, 0, n - 1);
    }
  }

  public void reverse(int[] arr, int start, int end) {
    int i = start;
    int j = end;
    for (; i < j; i++, j--) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
  }
}
