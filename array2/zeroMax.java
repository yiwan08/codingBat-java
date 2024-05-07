/*
Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.

zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
zeroMax([0, 1, 0]) → [1, 1, 0]
*/

public class Main
{
  public static void main(String[] args) {
    System.out.println(zeroMax(new int[0, 0, 0, 9, 0, 0, 8, 0, 3, 0]));
  }

  public static int[] zeroMax(int[] nums) {
    int saveMax = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        for (int j = i; j < nums.length; j++) {
          if ((nums[j] % 2 != 0) && (nums[j] > saveMax)) {
            saveMax = nums[j];
          }
        }
        nums[i] = saveMax;
        saveMax = 0;
      }
    }
    return nums;
  }
}
