/*
https://programmers.co.kr/learn/courses/30/lessons/12930
*/

class Solution {
    public String solution(String s) {
        String answer = "";
        if (s.length() == 0) {
            return answer;
        }
        String[] arr = s.split(" ", -1);

        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (j == 0 || j % 2 == 0) {
                    answer += String.valueOf(ch).toUpperCase();
                } else {
                    answer += String.valueOf(ch).toLowerCase();
                }
            }
            if (i < arr.length - 1) {
                answer += " ";
            }
        }
        return answer;
    }
}