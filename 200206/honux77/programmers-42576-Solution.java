//프로그래머스 완주하지 못한 선수

import java.util.HashMap;

public class Solution {

        public String solution(String[] participant, String[] completion) {
        HashMap <String, Integer> cmap = new HashMap<>();

        for (String s: completion) {
            Integer n = cmap.get(s);
            if (n == null) {
                cmap.put(s, 1);
            }
            else {
                n++;
                cmap.put(s, n);
            }
        }

        for (String s: participant) {
            Integer n = cmap.get(s);
            if(n == null || n == 0) {
                return s;
            } else {
                n--;
                cmap.put(s, n);
            }
        };
        return "Me";
    }
}