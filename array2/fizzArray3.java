/*
Given start and end numbers, return a new array containing the sequence of integers from start up to but not including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}.
The end number will be greater or equal to the start number. Note that a length-0 array is valid.

fizzArray3(5, 10) → [5, 6, 7, 8, 9]
fizzArray3(11, 18) → [11, 12, 13, 14, 15, 16, 17]
fizzArray3(1, 3) → [1, 2]
*/

import java.util.Scanner;

public class test {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(fizzArray3(0, 9));
    }

    public int[] fizzArray3(int start, int end) {
      int[] array = new int[end-start];
      int counter = 0;
      for (int i = start; i < end; i++) {
        array[counter] = i;
        counter++;
      }
      return array;
    }
}
