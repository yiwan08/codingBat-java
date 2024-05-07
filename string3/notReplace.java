/*
Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)

notReplace("is test") → "is not test"
notReplace("is-is") → "is not-is not"
notReplace("This is right") → "This is not right"
*/

public class Main
{
  public static void main(String[] args) {
    System.out.println(notReplace("is this not test"));
  }

  public static String notReplace(String str) {
    str = " " + str + " ";
    String resultStr = "";
    for (int i = 1; i < str.length()-1; i++) {
      if (i < str.length()-1 && str.substring(i, i+2).equals("is")) {
        if (!Character.isLetter(str.charAt(i-1)) && !Character.isLetter(str.charAt(i+2))) {
          resultStr += "is not";
          i++;
        } else {
          resultStr += str.substring(i, i+1);
        }
      } else {
        resultStr += str.substring(i, i+1);
      }
    }
    return resultStr;
  }
}
