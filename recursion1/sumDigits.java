/*
Given a non-negative int n, return the sum of its digits recursively (no loops).
Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

sumDigits(126) → 9
sumDigits(49) → 13
sumDigits(12) → 3
*/

public class Main
{
  public static void main(String[] args) {
    System.out.println(sumDigits(10));
  }
  
  public int sumDigits(int n) {
    if (n % 10 == n) {
      return n;
    }
    return sumDigits(n % 10) + sumDigits(n / 10);
  }
}
