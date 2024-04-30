/*
For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.

tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
*/

import java.util.Scanner;

public class test {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(tenRun(new int[]{1, 2, 10, 5, 20, 5}));
    }

    public static int[] tenRun(int[] nums) {
      // corner case
      if (nums.length == 0) {
        return nums;
      }
      
      int[] result = nums;
      int inputer = nums[0];
      
      boolean isPrev10 = false;
      boolean change10 = false;
      
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] % 10 == 0) {
          isPrev10 = true;
        }
        // blocking inputer value to multiple of 10, except for numbers before the first 10th.
        if (isPrev10) {
          inputer = nums[i];
          isPrev10 = false;
          change10 = true;
        }
        // after a new multiple of 10 is detected, start applying the change of the inputer.
        if (change10) {
          result[i] = inputer;
        }
      }
      return result;
    }

}
