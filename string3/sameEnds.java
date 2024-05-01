/*
Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".

sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
*/

public class Main
{
  public static void main(String[] args) {
    System.out.println(sameEnds("xxxxx"));
  }

  public static String sameEnds(String string) {
    String frontStr = "";
    String backStr = "";
    int counter = 0;
    for (int i = 0; i < string.length(); i++) {
      if ((frontStr.length() != counter) && (string.charAt(i) == frontStr.charAt(counter))) {
        backStr += string.substring(i, i+1);
        counter++;
      } else {
        frontStr += string.substring(i, i+1);
      }
    }
    
    String resultStr = "";
    for (int i = 0; i < backStr.length(); i++) {
      if (frontStr.charAt(i) == backStr.charAt(i)) {
        resultStr += frontStr.substring(i, i+1);
      }
    }
    return resultStr;
  }
}
