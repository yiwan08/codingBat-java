/*
Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.

post4([2, 4, 1, 2]) → [1, 2]
post4([4, 1, 4, 2]) → [2]
post4([4, 4, 1, 2, 3]) → [1, 2, 3]
*/

public class Main
{
  public static void main(String[] args) {
    System.out.println(post4(new int[2, 4, 1, 4, 4]));
  }

  public static int[] post4(int[] nums) {
    int counter = nums.length-1;
    while (nums[counter] != 4) {
      counter--;
    }
    
    int[] resultArr = new int[nums.length-counter-1];
    for (int i = 0; i < nums.length-counter-1; i++) {
      resultArr[i] = nums[counter+i+1];
    }
    return resultArr;
  }
}
