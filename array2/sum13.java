/*
Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.

sum13([1, 2, 2, 1]) → 6
sum13([1, 1]) → 2
sum13([1, 2, 2, 1, 13]) → 6
*/

public class Main
{
  public static void main(Stirng[] args)
  {
    int[] arr1 = {2, 2, 2, 13};
    System.out.println(sum13(arr1));
  }

  public static int sum13(int[] nums) {
    int result = 0;
    int in = 1;
    for(int i = 0; i < nums.length; i += in)
    {
      if(nums[i] == 13) {
        in = 2;
        result += 0;
      } else {
        in = 1;
        result += nums[i];
      }
    }
    return result;
  }
}
