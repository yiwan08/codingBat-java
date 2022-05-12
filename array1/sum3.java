/*
Given an array of ints length 3, return the sum of all the elements.

sum3([1, 2, 3]) → 6
sum3([5, 11, 2]) → 18
sum3([7, 0, 0]) → 7
*/

public class Main
{
  public static void main(String[] args)
  {
    int[] arr1 = {1, 2, 3};
    System.out.println(sum3(arr1));
  }

  public static int sum3(int[] nums) {
    int sum = 0;
    for(int i = 0; i < nums.length; i++)
    {
      sum += nums[i];
    }
    return sum;

    // OR

    return nums[0] + nums[1] + nums[2];
  }
}
