/*
Given arrays nums1 and nums2 of the same length, for every element in nums1,
consider the corresponding element in nums2 (at the same index).
Return the count of the number of times that the two elements differ by 2 or less, but are not equal.

matchUp([1, 2, 3], [2, 3, 10]) → 2
matchUp([1, 2, 3], [2, 3, 5]) → 3
matchUp([1, 2, 3], [2, 3, 3]) → 2
*/

public class Main
{
  public static void main(String[] args) {
    System.out.println(matchUp([2, 2, 3], [4, 4, 2]));
  }
  
  public int matchUp(int[] nums1, int[] nums2) {
    int count = 0;
    for (int i = 0; i < nums1.length; i++) {
      int absVal = Math.abs(nums1[i] - nums2[i]);
      if (absVal <= 2 && absVal != 0) {
        count++;
      }
    }
    return count;
  }
}
