/*
Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.

frontPiece([1, 2, 3]) → [1, 2]
frontPiece([1, 2]) → [1, 2]
frontPiece([1]) → [1]
*/

public class Main
{
  public static void main(String[] args)
  {
    int[] arr1 = {2, 2, 2, 2, 2};
    System.out.println(frontPiece(arr1));
  }

  public static int[] frontPiece(int[] nums) {
    if(nums.length < 2) {
      return nums;
    }
    int[] result = {nums[0], nums[1]};
    return result;
  }
}
