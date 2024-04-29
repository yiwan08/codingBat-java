/*
Return true if the group of N numbers at the start and end of the array are the same. For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.

sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false
*/

import java.util.Scanner;

public class test {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(sameEnds(new int[]{5, 6, 45, 99, 5, 6, 44}, 3));
    }

    public static boolean sameEnds(int[] nums, int len) {
        boolean checker = true;

        for (int i = 0; i < len; i++) {
            if (nums[i] == nums[nums.length-len+i]) {
                checker = true;
            } else {
                return false;
            }
        }
        return checker;
    }
}
