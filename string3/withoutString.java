public class Main
{
  public static void main(String[] args)
  {
    System.out.println(evenlySpaced(2, 2, 2));
  }

  public String withoutString(String base, String remove) {
    for (int i = 0; i < base.length() - remove.length() + 1; i++) {
      String temp = base.substring(i, i+remove.length());
      if (temp.equals(remove) || temp.equals(remove.toLowerCase()) || temp.equals(remove.toUpperCase())) {
        base = base.replace(base.substring(i, i+remove.length()), "");
      }
    }
    return base;
  }
}
