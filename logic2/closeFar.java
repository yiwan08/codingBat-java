/*
Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.

closeFar(1, 2, 10) → true
closeFar(1, 2, 3) → false
closeFar(4, 1, 3) → true
*/

public class Main
{
  public void main(String[] args)
  {
    System.out.println(closeFar(2, 2, 2));
  }

  public boolean closeFar(int a, int b, int c) {
    int bigger = Math.max(Math.abs(b - a), Math.abs(c - a));
    int smaller = Math.min(Math.abs(b - a), Math.abs(c - a));
    int bigNum = Math.max(b, c);
    int smallNum = Math.min(b, c);
    if(smaller <= 1 && bigger >= 2 && bigNum - smallNum >= 2) {
      return true;
    }
    return false;
  }
}
