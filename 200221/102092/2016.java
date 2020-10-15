/*
https://programmers.co.kr/learn/courses/30/lessons/12901
*/

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] weekends = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        int[] days = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int temp = 0;

        for (int i = 0; i < a - 1; i++) {
            temp += days[i];
        }
        temp += b - 1;
        answer = weekends[temp % 7];

        return answer;
    }
}