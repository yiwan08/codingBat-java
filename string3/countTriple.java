public class Main
{
  public static void main(String[] args) {
    System.out.println(countTriple("xxxabyyyycd"));
  }

  public int countTriple(String str) {
    int count = 0;
    for (int i = 0; i < str.length() - 2; i++) {
      if (str.charAt(i) == str.charAt(i+1) && str.charAt(i) == str.charAt(i+2)) {
        count += 1;
      }
    }
    return count;
  }
}
