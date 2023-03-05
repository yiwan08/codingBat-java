/*
Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

either24([1, 2, 2]) → true
either24([4, 4, 1]) → true
either24([4, 4, 1, 2, 2]) → false
*/

public class Main
{
  public static void main(String[] args) {
    System.out.println(either24([2, 2, 2, 3, 4, 4, 4]));
  }
  
  public boolean either24(int[] nums) {
    int countTwo = 0;
    int countFour = 0;
    for (int i = 0; i < nums.length-1; i++) {
      if (nums[i] == 2 && nums[i+1] == 2) {
        countTwo++;
      }
      if (nums[i] == 4 && nums[i+1] == 4) {
        countFour++;
      }
    }
    if (countTwo == 0 || countFour == 0) {
      if (countFour > 0 || countTwo > 0) {
        return true;
      }
    }
    return false;
  }
}
