/*
Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.

loneSum(1, 2, 3) → 6
loneSum(3, 2, 3) → 2
loneSum(3, 3, 3) → 0
*/

public class Main
{
  public static void main(String[] args) {
    System.out.println(loneSum(2, 2, 2));
  }

  public static int loneSum(int a, int b, int c) {
    int sum = a + b + c;
    if(a == b) {
      sum = sum - a - b;
    }
    if(a == c) {
      sum = sum - a - c;
    }
    if(c == b) {
      sum = sum - c - b;
    }
    if(sum < 0) {
      sum = 0;
    }
    return sum;
  }
}
