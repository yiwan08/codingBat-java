/*
Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).

equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true
*/

public class Main
{
  public static void main(String[] args) {
    System.out.println(equalIsNot("This is not equal"));
  }

  public boolean equalIsNot(String str) {
    int isCount = 0;
    int notCount = 0;
    
    for (int i = 0; i < str.length()-1; i++) {
      if (str.substring(i, i+2).equals("is")) {
        isCount += 1;
      }
    }
    
    for (int i = 0; i < str.length()-2; i++) {
      if (str.substring(i, i+3).equals("not")) {
        notCount += 1;
      }
    }
    return isCount == notCount;
  }
}
