/*
Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.

stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
*/

public class Main
{
  public static void main(String[] args) {
    System.out.println(stringX("x"));
  }

  public String stringX(String str) {
    String resultStr = "";
    for (int i = 0; i < str.length(); i++) {
      if ((i == str.length()-1) && (str.substring(i, i+1).equals("x"))) {
        resultStr += "x";
        return resultStr;
      }
      if ((i == 0) && (str.substring(i, i+1).equals("x"))) {
        resultStr += "x";
      }
      if (!str.substring(i, i+1).equals("x")) {
        resultStr += str.substring(i, i+1);
      }
    }
    return resultStr;
  }
}
