/*
 * 프로그래머스 2016년 - https://programmers.co.kr/learn/courses/30/lessons/12901
 * - Test Case를 하나 만들었다.
 * - 너무 쉬웠다. 역시 CodeSquad Java Playground!
 * - https://www.inflearn.com/course/java-codesquad/dashboard
 */
public class Solution {
    public String solution(int a, int b) {
        String[] dayOfWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int dateCount = 5;
        int[] monthDayArray = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < a - 1; i++) {
            dateCount += monthDayArray[i];
        }
        dateCount += b - 1;

        return dayOfWeek[dateCount % 7];
    }
}
