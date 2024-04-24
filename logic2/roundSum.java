/*
Round number that has last digit greater or equal to 5 up to the next multiple of 10, otherwise round down to the previous multiple of 10.
Return sum.

roundSum(16, 17, 18) → 60
roundSum(12, 13, 14) → 30
roundSum(6, 4, 4) → 10
*/

public class Main
{
  public static void main(String[] args)
  {
    System.out.println(roundSum(12, 80, 9));
  }

  public int roundSum(int a, int b, int c) {
    return round10(a) + round10(b) + round10(c);
  }

  public int round10(int num) {
    int determinator = (num / 10) * 10;
    if (num - determinator >= 5) {
      return determinator + 10;
    } else {
      return determinator;
    }
  }
}
