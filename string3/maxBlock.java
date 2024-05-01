/*
Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.

maxBlock("hoopla") → 2
maxBlock("abbCCCddBBBxx") → 3
maxBlock("") → 0
*/

public class Main
{
  public static void main(String[] args) {
    System.out.println(maxBlock("heelloooooo"));
  }

  public static int maxBlock(String str) {
    int counter = 0;
    int maxCounter = 0;
    for (int i = 0; i < str.length()-1; i++) {
      if (str.charAt(i) == str.charAt(i+1)) {
        counter++;
      } else {
        counter = 0;
      }
      
      if (counter > maxCounter-1) {
        maxCounter = counter+1;
      }
    }
    return maxCounter;
  }
}
