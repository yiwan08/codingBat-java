public boolean scoresIncreasing(int[] scores) {
  for (int i = 1; i < scores.length; i++) {
    if (!(scores[i] >= scores[i-1])) {
      return false;
    }
  }
  return true;
}
-------------------
public boolean scores100(int[] scores) {
  for (int i = 0; i < scores.length-1; i++) {
    if (scores[i] == 100 && scores[i] == scores[i+1]) {
      return true;
    }
  }
  return false;
}
-------------------
public boolean scoresClump(int[] scores) {
  for (int i = 0; i < scores.length-2; i++) {
    if (scores[i+2] - scores[i] <= 2) {
      return true;
    }
  }
  return false;
}
-------------------
public int scoresAverage(int[] scores) {
  int aveOne = average(scores, 0, scores.length/2);
  int aveTwo = average(scores, scores.length/2, scores.length);
  if (aveOne > aveTwo) {
    return aveOne;
  }
  return aveTwo;
}
public int average(int[] scores, int start, int end) {
  int sum = 0;
  for (int i = start; i < end; i++) {
    sum += scores[i];
  }
  return sum / (end-start);
}
-------------------
public int wordsCount(String[] words, int len) {
  int count = 0;
  for (int i = 0; i < words.length; i++) {
    if (words[i].length() == len) {
      count++;
    }
  }
  return count;
}
-------------------
public String[] wordsFront(String[] words, int n) {
  String[] resultArr = new String[n];
  for (int i = 0; i < n; i++) {
    resultArr[i] = words[i];
  }
  return resultArr;
}
-------------------
public List wordsWithoutList(String[] words, int len) {
  ArrayList<String> resultArr = new ArrayList<String>();
  for (int i = 0; i < words.length; i++) {
    if (!(words[i].length() == len)) {
      resultArr.add(words[i]);
    }
  }
  return resultArr;
}
-------------------
public boolean hasOne(int n) {
  while (n != 0) {
    if (n % 10 == 1) {
      return true;
    }
    n /= 10;
  }
  return false;
}
-------------------
public boolean dividesSelf(int n) {
  int num = n;
  while (n != 0) {
    if ((n % 10 == 0) || (num % (n % 10) != 0)) {
      return false;
    }
    n /= 10;
  }
  return true;
}
-------------------
public int[] copyEvens(int[] nums, int count) {
  int[] resultArr = new int[count];
  int index = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] % 2 == 0 && index != count) {
      resultArr[index] = nums[i];
      index++;
    }
  }
  return resultArr;
}
-------------------
public int[] copyEndy(int[] nums, int count) {
  int[] resultArr = new int[count];
  int index = 0;
  for (int i = 0; i < nums.length; i++) {
    if (isEndy(nums[i]) && index != count) {
      resultArr[index] = nums[i];
      index++;
    }
  }
  return resultArr;
}
public boolean isEndy(int n) {
  if ((0 <= n && n <= 10) || (90 <= n && n <= 100)) {
    return true;
  }
  return false;
}
-------------------
public int matchUp(String[] a, String[] b) {
  int count = 0;
  for (int i = 0; i < a.length; i++) {
    if ((a[i].length() != 0 && b[i].length() != 0) && (a[i].charAt(0) == b[i].charAt(0))) {
      count++;
    }
  }
  return count;
}
-------------------
public int scoreUp(String[] key, String[] answers) {
  int mark = 0;
  for (int i = 0; i < key.length; i++) {
    if (!answers[i].equals("?")) {
      if (key[i].equals(answers[i])) {
        mark += 4;
      } else {
        mark -= 1;
      }
    }
  }
  return mark;
}
-------------------
public String[] wordsWithout(String[] words, String target) {
  int length = 0;
  for (int i = 0; i < words.length; i++) {
    if (!words[i].equals(target)) {
      length++;
    }
  }
  String[] resultArr = new String[length];
  int index = 0;
  for (int i = 0; i < words.length; i++) {
    if (!words[i].equals(target) && index != length) {
      resultArr[index] = words[i];
      index++;
    }
  }
  return resultArr;
}
-------------------
public int scoresSpecial(int[] a, int[] b) {
  return largestSpecial(a) + largestSpecial(b);
}
public int largestSpecial(int[] array) {
  int largest = 0;
  for (int i = 0; i < array.length; i++) {
    if (array[i] > largest && array[i] % 10 == 0) {
      largest = array[i];
    }
  }
  return largest;
}
-------------------
