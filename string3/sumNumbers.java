/*
Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18
*/

public class Main
{
  public static void main(String[] args) {
    System.out.println(sumNumbers("123fourfivesix78"));
  }

  public static int sumNumbers(String str) {
    String tempStr = "";
    boolean started = false;
    int sum = 0;
    
    str += "x";
    for (int i = 0; i < str.length(); i++) {
      if (Character.isDigit(str.charAt(i))) {
        tempStr += str.charAt(i);
        started = true;
      } else {
        if (tempStr.length() != 0) {
          sum += Integer.parseInt(tempStr);
          tempStr = "";
        }
        started = false;
      }
    }
    return sum;
  }
}
