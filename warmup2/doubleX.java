/*
If the first instance of x is followed by another x, return true; otherwise, return false.

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
*/

public class Main
{
  public static void main(String[] args) {
    System.out.println(doubleX("xaxxxx"));
  }

  public boolean doubleX(String str) {
    for (int i = 0; i < str.length()-1; i++) {
      if (str.substring(i, i+1).equals("x")) {
        if (str.substring(i+1, i+2).equals("x")) {
          return true;
        }
        return false;
      }
    }
    return false;
  }
}
