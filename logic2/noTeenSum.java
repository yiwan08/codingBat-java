/*
Find sum of three numbers, but if number inclusively within 13-19, count as 0, except 15 and 16.

noTeenSum(1, 2, 3) → 6
noTeenSum(2, 13, 1) → 3
noTeenSum(2, 1, 14) → 3
*/

public class Main
{
  public static void main(String[] args)
  {
    System.out.println(noTeenSum(13, 16, 8));
  }

  public int noTeenSum(int a, int b, int c) {
    return fixTeen(a) + fixTeen(b) + fixTeen(c);
  }
  
  public int fixTeen (int n) {
    if ((n <= 19) && (n >= 13)) {
      if ((n == 15) || (n == 16)) {
        return n;
      }
      return 0;
    } else {
      return n;
    }
  }
}
