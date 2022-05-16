/*
Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.

double23([2, 2]) → true
double23([3, 3]) → true
double23([2, 3]) → false
*/

public class Main
{
  public static void main(String[] args)
  {
    int[] arr1 = {2, 2};
    System.out.println(double23(arr1));
  }

  public static boolean double23(int[] nums) {
    if(nums.length > 1 && (nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3)) {
      return true;
    }
    return false;
  }
}
