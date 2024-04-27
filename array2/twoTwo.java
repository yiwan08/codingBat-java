/*
Given an array of ints, return true if every 2 that appears in the array is next to another 2.

twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false
*/

public class Main
{
  public static void main(String[] args) {
    System.out.println(twoTwo([2, 2, 2, 3, 2]));
  }

  public boolean twoTwo(int[] nums) {
    boolean checker = true;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 2) {
        if ((i < nums.length-1 && nums[i+1] == 2) || (i > 1 && nums[i-1] == 2)) {
          checker = true;
          i++;
        } else {
          return false;
        }
      }
    }
    return checker;
  }
}
