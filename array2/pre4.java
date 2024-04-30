/*
Given a non-empty array of ints, return a new array containing the elements from the original array that come before the first 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.

pre4([1, 2, 4, 1]) → [1, 2]
pre4([3, 1, 4]) → [3, 1]
pre4([1, 4, 4]) → [1]
*/

import java.util.Scanner;

public class test {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(pre4(new int[]{1, 0, 0, 4, 4, 6}));
    }

    public static int[] pre4(int[] nums) {
      int p = 0;
      while (nums[p] != 4) {
        p++;
      }
      int[] result = new int[p];
      for (int i = 0; i < p; i++) {
        result[i] = nums[i];
      }
      return result;
    }
}

// WOAH! While Loops!!! Long time no see
