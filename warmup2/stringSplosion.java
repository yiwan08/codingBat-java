/*
Given a non-empty string like "Code" return a string like "CCoCodCode".

stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
*/

public class Main
{
  public static void main(String[] args) {
    System.out.println(stringSplosion("HelloWorld!!"));
  }

  public String stringSplosion(String str) {
    String resultStr = "";
    for (int i = 0; i < str.length(); i++) {
      resultStr += str.substring(0, i+1);
    }
    return resultStr;
  }
}
