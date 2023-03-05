/*
Given an array of ints, return true if the number of 1's is greater than the number of 4's

more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
*/

public class Main
{
  public static void main(String[] args) {
    System.out.println(more14([1, 1, 4, 4, 2, 3, 1]));
  }
  
  public boolean more14(int[] nums) {
    int countOne = 0;
    int countFour = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1) {
        countOne++;
      }
      if (nums[i] == 4) {
        countFour++;
      }
    }
    if (countOne > countFour) {
      return true;
    }
    return false;
  }
}
