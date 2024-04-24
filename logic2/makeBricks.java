/*
Small brick is 1 inch long, Big brick is 5 inch long.
Check to see if the given small/large bricks amount can get to the 'goal' length.

makeBricks(3, 1, 8) → true
makeBricks(3, 1, 9) → false
makeBricks(3, 2, 10) → true
*/

public class Main
{
  public static void main(String[] args) {
    System.out.println(makeBricks(3, 2, 9));
  }

  public boolean makeBricks(int small, int big, int goal) {
    // check whether the small/big numbers are 0
    if (small == 0) {
      int bigInch = big * 5;
      if (bigInch == goal) {
        return true;
      } else if ((bigInch > goal) && (((bigInch % goal) % 5) == 0)) {
        return true;
      } else {
        return false;
      }
    } else if (big == 0) {
      if (small >= goal) {
        return true;
      } else {
        return false;
      }
    }
    
    // the rest of the chekcs
    if (small + big * 5 >= goal) {
      if ((goal / 5 <= big) && (goal - ((goal/5)*5) <= small)) {
        return true;
      } else if ((goal / 5 > big) && (goal - big*5 <= small)) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }
}
