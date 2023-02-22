public class Main
{
  public static void main(String[] args)
  {
    int[] arr1 = {1, 2, 3, 4, 100};
    System.out.println(centeredAverage(arr1));
  }

  public int centeredAverage(int[] nums) {
    int max = nums[0];
    int min = nums[0];
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
      if (nums[i] < min) {
        min = nums[i];
      }
      sum += nums[i];
    }
    return (sum - max - min) / (nums.length - 2);
  }
}
