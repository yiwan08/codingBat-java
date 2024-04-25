/*
Return every other characters in the given string.

stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"
*/

public class Main
{
  public static void main (String[] args) {
    System.out.println(stringBits("Helloooooooo"));
  }

  public String stringBits(String str) {
    String resultStr = "";
    for (int i = 0; i < str.length(); i+=2) {
      resultStr += str.substring(i, i+1);
    }
    return resultStr;
  }
}
