import java.util.*;

/*
https://programmers.co.kr/learn/courses/30/lessons/12915
*/

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.charAt(n) > s2.charAt(n)) {
                    // 오름차순
                    return 1;
                } else if (s1.charAt(n) < s2.charAt(n)) {
                    // 오름차순으로 되어있으면 굳이 자리 바꾸지 말고
                    return -1;
                } else {
                    return s1.compareTo(s2);
                }
            }
        });
        return strings;
    }
}