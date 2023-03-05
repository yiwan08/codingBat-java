/*
Given a number n, create and return a new int array of length n,
containing the numbers 0, 1, 2, ... n-1. The given n may be 0,
in which case just return a length 0 array.

fizzArray(4) → [0, 1, 2, 3]
fizzArray(1) → [0]
fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
*/

public class Main
{
  public static void main(String[] args) {
    System.out.println(fizzArray(7));
  }
  
  public int[] fizzArray(int n) {
    int[] myArray = new int[n];
    int curNum = 0;
    for (int i = 1; i < myArray.length; i++) {
      myArray[i] = curNum + 1;
      curNum = myArray[i];
    }
    return myArray;
  }
}
