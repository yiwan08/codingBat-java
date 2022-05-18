/*
Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.

plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
*/

public class Main
{
  public static void main(String[] args)
  {
    int[] arr1 = {2, 2};
    int[] arr2 = {2, 2}
    System.out.println(plusTwo(arr1, arr2));
  }

  public static int[] plusTwo(int[] a, int[] b) {
    int[] result = {a[0], a[1], b[0], b[1]};
    return result;
  }
}
