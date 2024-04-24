/*
Anything right to 13 will not be counted towards sum. Return sum

luckySum(1, 2, 3) → 6
luckySum(1, 2, 13) → 3
luckySum(1, 13, 3) → 1
*/

public class Main
{
  public void main(String[] args)
  {
    System.out.println(luckySum(2, 13, 0));
  }

  public int luckySum(int a, int b, int c) {
    if (a == 13) {
      return 0;
    } else if (b == 13) {
      return a;
    } else if (c == 13) {
      return a + b;
    } else {
      return a + b + c;
    }
  }
}
