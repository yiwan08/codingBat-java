/*
Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.

tripleUp([1, 4, 5, 6, 2]) → true
tripleUp([1, 2, 3]) → true
tripleUp([1, 2, 4]) → false
*/

import java.util.Scanner;

public class test {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(tripleUp(new int[]{33, 34, 32, 3}));
    }

  public static boolean tripleUp(int[] nums) {
    for (int i = 0; i < nums.length-2; i++) {
      if (nums[i]+1 == nums[i+1] && nums[i]+2 == nums[i+2]) {
        return true;
      }
    }
    return false;
  }
}
