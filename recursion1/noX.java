/*
Given a string, compute recursively a new string where all the 'x' chars have been removed.

noX("xaxb") → "ab"
noX("abc") → "abc"
noX("xx") → ""
*/

public class Main
{
  public static void main(String[] args) {
    System.out.println(noX("xhhxxhhx"));
  }
  public String noX(String str) {
    if (str.length() == 0) {
      return str;
    }
    if (str.charAt(0) == 'x') {
      return noX(str.substring(1));
    }
    return str.charAt(0) + noX(str.substring(1));
  }
}
