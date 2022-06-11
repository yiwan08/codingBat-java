/*
Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.

blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19
*/

public class Main
{
  public static void main(String[] args)
  {
    System.out.println(blackjack(21, 21));
  }

  public static int blackjack(int a, int b) {

    int max = Math.max(a, b);
    int min = Math.min(a, b);
    a = max;
    b = min;

    if(a == 21 || b == 21) {
      return 21;
    } else if(a <= 21) {
        return a;
    } else if(b <= 21) {
      return b;
    } else {
      return 0;
    }
  }
}
