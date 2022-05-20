/*
Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.

front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]
*/

public class Main
{
  public static void main(String[] args)
  {
    int[] arr1 = new int[0];
    int[] arr2 = {2};
    System.out.println(front11(arr1, arr2));
  }

  public static int[] front11(int[] a, int[] b) {
    int[] result;
    if(a.length > 0 && b.length > 0) {
      result = new int[2];
      result[0] = a[0];
      result[1] = b[0];
      return result;
    }
    if(a.length == 0) {
      if(b.length > 0) {
        result = new int[1];
        result[0] = b[0];
        return result;
      }
    } else if(b.length == 0) {
      result = new int[1];
      result[0] = a[0];
      return result;
    }
    return result = new int[0];
  }
}
