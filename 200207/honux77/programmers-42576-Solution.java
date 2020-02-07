//프로그래머스 완주하지 못한 선수

import java.util.HashMap;

public class Solution {

        public String solution(String[] participant, String[] completion) {
        HashMap <String, Integer> cmap = new HashMap<>();

        for (String s: completion) {
            cmap.put(s, cmap.getOrDefault(s, 0) + 1);
        }

        for (String s: participant) {
            int n = cmap.getOrDefault(s, 0);
            if (n == 0) return s;
            cmap.put(s, n - 1);
        }
        return "error";
    }
}