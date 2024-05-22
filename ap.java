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
