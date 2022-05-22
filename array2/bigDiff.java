/*
Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.

bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8
*/

public class Main
{
  public static void main(String[] args)
  {
    int[] arr1 = {2, 20, 200, 2000};
    System.out.println(bigDiff(arr1));
  }

  public static int bigDiff(int[] nums) {
    int max = nums[0];
    int min = nums[0];
    for(int i = 0; i < nums.length - 1; i++)
    {
      if(max(nums[i], nums[i + 1]) > max) {
        max = max(nums[i], nums[i + 1]);
      }
      if(min(nums[i], nums[i + 1]) < min) {
        min = min(nums[i], nums[i + 1]);
      }
    }
    return max - min;
  }
  
  public static int max(int a, int b)
  {
    int result = a;
    if(b > a) {
      result = b;
    }
    return result;
  }
  public static int min(int a, int b)
  {
    int result = a;
    if(b < a) {
      result = b;
    }
    return result;
  }
}
