/*
https://programmers.co.kr/learn/courses/30/lessons/12926
*/

class Solution {
    public String solution(String s, int n) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ')
                continue;
            // 범위 넘어가는 대문자
            else if (chars[i] <= 'Z' && chars[i] >= 'A' && chars[i] + n > 'Z')
                chars[i] = (char) (chars[i] + n - 26);
            // 범위 넘어가는 소문자
            else if (chars[i] <= 'z' && chars[i] >= 'a' && chars[i] + n > 'z')
                chars[i] = (char) (chars[i] + n - 26);
            else
                chars[i] = (char) (chars[i] + n);

        }
        return String.valueOf(chars);
    }
}