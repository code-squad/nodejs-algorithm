import java.util.*;

/*
https://programmers.co.kr/learn/courses/30/lessons/42840
*/

class Solution {
    public int[] solution(int[] answers) {
        int[] A = new int[] { 1, 2, 3, 4, 5 };
        int[] B = new int[] { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] C = new int[] { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

        List<Integer> answer = new ArrayList<>();
        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 0; i < answers.length; i++) {
            if (A[i % A.length] == answers[i])
                a += 1;
            if (B[i % B.length] == answers[i])
                b += 1;
            if (C[i % C.length] == answers[i])
                c += 1;
        }

        int max = Math.max(a, Math.max(b, c));

        if (a == max)
            answer.add(1);
        if (b == max)
            answer.add(2);
        if (c == max)
            answer.add(3);

        int[] ret = answer.stream().mapToInt(Integer::intValue).toArray();
        return ret;
    }
}