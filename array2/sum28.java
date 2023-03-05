/*
Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.

sum28([2, 3, 2, 2, 4, 2]) → true
sum28([2, 3, 2, 2, 4, 2, 2]) → false
sum28([1, 2, 3, 4]) → false
*/

public class Main
{
  public static void main(String[] args) {
    System.out.println(sum28([2, 2, 2, 2, 2, 2, 1]));
  }
  
  public boolean sum28(int[] nums) {
    int sumTwo = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 2) {
        sumTwo += 2;
      }
    }
    if (sumTwo == 8) {
      return true;
    } else {
      return false;
    }
  }
}
