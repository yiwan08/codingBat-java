/*
Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".

mirrorEnds("abXYZba") → "ab"
mirrorEnds("abca") → "a"
mirrorEnds("aba") → "aba"
*/

public class Main
{
  public static void main(String[] args) {
    System.out.println(mirrorEnds("xxxxxxx"));
  }

  public static String mirrorEnds(String string) {
    String reverseStr = "";
    for (int i = string.length()-1; i > -1; i--) {
      reverseStr += string.substring(i, i+1);
    }
    
    String resultStr = "";
    for (int i = 0; i < string.length(); i++) {
      if (string.charAt(i) == reverseStr.charAt(i)) {
        resultStr += string.substring(i, i+1);
      } else {
        return resultStr;
      }
    }
    return resultStr;
  }
}
