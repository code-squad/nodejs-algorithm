//https://programmers.co.kr/learn/courses/30/lessons/12903
class Solution {
  public String solution(String s) {
      String answer = "";
      int m = s.length() / 2;
      if (s.length() % 2 == 0) {
          answer = s.substring(m - 1, m + 1);
      } else {
          answer = s.substring(m, m + 1);
      }
      return answer;
  }
}
