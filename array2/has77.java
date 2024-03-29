/*
Given an array of ints, return true if the array contains two 7's next to each other,
or there are two 7's separated by one element, such as with {7, 1, 7}.

has77([1, 7, 7]) → true
has77([1, 7, 1, 7]) → true
has77([1, 7, 1, 1, 7]) → false
*/

public class Main
{
  public static void main(String[] args) {
    System.out.println(has77([7, 1, 7, 1, 7, 1]));
  }
  
  public boolean has77(int[] nums) {
    for (int i = 0; i < nums.length-1; i++) {
      if (nums.length - i <= 2) {
        if (nums[i] == 7 && nums[i+1] == 7) {
          return true;
        }
      } else {
        if (nums[i] == 7 && (nums[i+1] == 7 || nums[i+2] == 7)) {
          return true;
        }
      }
    }
    return false;
  }
}

// OR

public boolean has77(int[] nums) {
  if (nums.length > 1) {
    if (nums[nums.length-2] == 7) {
      if (nums[nums.length-1] == 7) {
        return true;
      }
    }
  }

  for (int i = 0; i < nums.length-2; i++) {
    if (nums[i] == 7) {
      if (nums[i+2] == 7) {
        return true;
      } else if (nums[i+1] == 7) {
        return true;
      }
    }
  }
  return false;
}

// OR

public boolena has77(int[] nums) {
  for (int i = 0; i < nums.length; i++) {
    if (i != nums.length - 2) {
      if (nums[i] == 7 && nums[i+2] == 7) {
        return true;
      }
    }
    if (nums[i] == 7 && nums[i+2] == 7) {
      return true;
    }
  }
  return false;
}
