/*
Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.

make2([4, 5], [1, 2, 3]) → [4, 5]
make2([4], [1, 2, 3]) → [4, 1]
make2([], [1, 2]) → [1, 2]
*/

public class Main
{
  public static void main(String[] args)
  {
    int[] arr1 = new int[1];
    int[] arr2 = {2, 2, 2, 2};
    System.out.println(make2(arr1, arr2));
  }

  public static int[] make2(int[] a, int[] b) {
    int[] result = new int[2];
    if(a.length >= 2) {
      result[0] = a[0];
      result[1] = a[1];
      return result;
    } else if(a.length == 1) {
      result[0] = a[0];
      result[1] = b[0];
      return result;
    } else {
      result[0] = b[0];
      result[1] = b[1];
      return result;
    }
  }
}
