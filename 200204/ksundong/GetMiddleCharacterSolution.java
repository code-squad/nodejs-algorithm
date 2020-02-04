/**
 * 프로그래머스 가운데 글자 가져오기 (https://programmers.co.kr/learn/courses/30/lessons/12903)
 * - Test Case를 가져와서 만들었다.
 * - 역시 너무 쉬웠다.
 * - 좀 더 짧은 코드를 만들기 위해서, 짝수, 홀수 모두 통용되는 코드를 짜기위해 노력했다.
 */
public class Solution {
    public String solution(String s) {
        int length = s.length();
        int halfLength = (length - 1) / 2;
        int endIndex = length / 2 + 1;
        return s.substring(halfLength, endIndex);
    }
}
