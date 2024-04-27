/*
Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.

has271([1, 2, 7, 1]) → true
has271([1, 2, 8, 1]) → false
has271([2, 7, 1]) → true
*/

public class Main
{
  public static void main(String[] args) {
    System.out.println(has271([2, 7, 1, 1, 1, 2, 7, 0]));
  }

  public boolean has271(int[] nums) {
    for (int i = 0; i < nums.length-1; i++) {
      int firstVal = nums[i];
      if (nums[i+1] - firstVal == 5) {
        int firstDiff = firstVal - 1;
        if ((nums[i+2] <= firstVal + 1) && (nums[i+2] >= firstVal - 3)) {
          return true;
        }
      }
    }
    return false;
  }
}
