/*
Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
but not the 'y' in "yellow" (not case sensitive).
We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it.
*/

public class Main
{
  public static void main String(args[]) {
    System.out.println(countYZ("fez day"));
  }
  
  public int countYZ(String str) {
    int count = 0;
    str = str.toLowerCase() + " ";
    for (int i = 1; i < str.length(); i++) {
      if (!Character.isLetter(str.charAt(i))) {
        if (str.charAt(i-1) == 'z' || str.charAt(i-1) == 'y') {
          count += 1;
        }
      }
    }
    return count;
  }
}
