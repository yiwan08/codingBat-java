/*
Classical fizzBuzz question but with String[]

fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]
fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
*/

public class Main
{
  public static void main(String[] args) {
    System.out.println(fizzBuzz(88, 99));
  }

  public static String[] fizzBuzz(int start, int end) {
    String[] resultArr = new String[end-start];
    int counter = 0;
    for (int i = start; i < end; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        resultArr[counter] = "FizzBuzz";
      } else if (i % 3 == 0) {
        resultArr[counter] = "Fizz";
      } else if (i % 5 == 0) {
        resultArr[counter] = "Buzz";
      } else {
        resultArr[counter] = String.valueOf(i);
      }
      counter++;
    }
    return resultArr;
  }
}
