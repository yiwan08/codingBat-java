public class Main
{
  public static void main(String[] args) {
    System.out.println(has12({1, 1, 1, 1, 2, 1}));
  }
  
  public boolean has12(int[] nums) {
    boolean indexOne = false;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1) {
        indexOne = true;
      }
      if (indexOne && nums[i] == 2) {
        return true;
      }
    }
    return false;
  }
}
