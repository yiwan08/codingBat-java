/*
Given a number n, create and return a new string array of length n,
containing the strings "0", "1" "2" .. through n-1. N may be 0, in which case just return a length 0 array.

fizzArray2(4) → ["0", "1", "2", "3"]
fizzArray2(10) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
fizzArray2(2) → ["0", "1"]
*/

public class Main
{
  public static void main(String[] args) {
    System.out.println(fizzArray2(7));
  }
  
  public String[] fizzArray2(int n) {
    String[] myArray = new String[n];
    int curNum = 0;
    for (int i = 0; i < myArray.length; i++) {
      myArray[i] = String.valueOf(curNum);
      curNum += 1;
    }
    return myArray;
  }
}
