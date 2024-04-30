/*
Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
You may modify and return the given array, or return a new array.

shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
shiftLeft([1, 2]) → [2, 1]
shiftLeft([1]) → [1]
*/

import java.util.Scanner;

public class test {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(shiftLeft(new int[]{3, 4, 5, 6, 7, 8}));
    }

    public static int[] shiftLeft(int[] nums) {
      int[] result = new int[nums.length];
      for (int i = 1; i <= nums.length; i++) {
        if (i == nums.length) {
          result[i-1] = nums[0];
        } else {
          result[i-1] = nums[i];
        }
      }
      return result;
    }
}
