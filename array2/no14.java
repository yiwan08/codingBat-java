/*
Given an array of ints, return true if it contains no 1's or it contains no 4's.

no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true
*/

public class Main
{
  public static void main(String[] args) {
    System.out.println(no14([1, 1, 1, 1, 1, 2]));
  }
  
  public boolean no14(int[] nums) {
    int indexOne = 0;
    int indexFour = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1) {
        indexOne++;
      }
      if (nums[i] == 4) {
        indexFour++;
      }
    }
    if (indexOne != 0 && indexFour != 0) {
      return false;
    } else {
      return true;
    }
  }
}
