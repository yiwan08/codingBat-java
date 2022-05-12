/*
Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

rotateLeft3([1, 2, 3]) → [2, 3, 1]
rotateLeft3([5, 11, 9]) → [11, 9, 5]
rotateLeft3([7, 0, 0]) → [0, 0, 7]
*/

public class Main
{
  public static void main(String[] args)
  {
    int[] arr1 = {1, 2, 3};
    System.out.println(rotateLeft3(arr1));
  }

  public static int[] rotateLeft3(int[] nums) {
    int[] result = {nums[1], nums[2], nums[0]};
    return result;
  }
}
