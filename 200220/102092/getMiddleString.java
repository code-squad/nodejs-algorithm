/*
https://programmers.co.kr/learn/courses/30/lessons/12903
*/

class Solution {
    public String solution(String s) {
        int length = s.length();
        String result = "";
        if (length % 2 != 0) {
            result = s.substring(length / 2, length / 2 + 1);
        } else {
            result = s.substring(length / 2 - 1, length / 2 + 1);
        }
        return result;
    }
}