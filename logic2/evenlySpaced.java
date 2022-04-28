/*
Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.

evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
*/

public class Main
{
  public static void main(String[] args)
  {
    System.out.println(evenlySpaced(2, 2, 2));
  }

  public static boolean evenlySpaced(int a, int b, int c) {
    int big = Math.max(Math.max(a, b), c);
    int small = Math.min(Math.min(a, b), c);
    int middle = a + b + c - big - small;
    if(big - middle == middle - small) {
      return true;
    }
    return false;
  }
  
  // OR
  
  public static boolean evenlySpaced(int a, int b, int c)
  {
    int[] anArray = {a, b, c};
    Arrays.sort(anArray);
    int diffLow = anArray[1] - anArray[0];
    int diffHi = anArray[2] - anArray[1];
    if (diffLow == diffHi)
      return true;
    else
      return false; 
  }
}
