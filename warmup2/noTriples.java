/*
Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.

noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false
*/

public class Main
{
  public static void main(String[] args) {
    System.out.println(noTriples([1, 1, 2, 2, 2, 1]));
  }

  public boolean noTriples(int[] nums) {
    for (int i = 0; i < nums.length-2; i++) {
      int currentVal = nums[i];
      if ((currentVal == nums[i+1]) && (currentVal == nums[i+2])) {
        return false;
      }
    }
    return true;
  }
}
