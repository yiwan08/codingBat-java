/*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
*/

public class Main
{
  public static void main(String[] args) {
    System.out.println(altPairs("The Quick Brown Fox"));
  }

  public String altPairs(String str) {
    String resultStr = "";
    for (int i = 0; i < str.length(); i++) {
      if (((1 - i) % 4 == 0) || ((0 - i) % 4 == 0)) {
        resultStr += str.substring(i, i+1);
      }
    }
    return resultStr;
  }
}
