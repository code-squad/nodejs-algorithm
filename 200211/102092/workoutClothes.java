import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
https://programmers.co.kr/learn/courses/30/lessons/42862

1. Greedy 문제
2. 다중 for문을 돌려야하나?
3. 정확히 어떤 컨셉의 문제인지 빠르게 캐치가 안됨.
4.
 */

class Solution {

    public int solution(int n, int[] lost, int[] reserve) {
        int result = n;
        result -= lost.length;

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                // 여분을 가져왔는데, 잃어버렸을 경우, 그러면 빌려줄 수 없으니까.
                if (lost[i] == reserve[j]) {
                    result++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }

        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j] - 1 || lost[i] == reserve[j] + 1) {
                    result++;
                    reserve[j] = -1;
                    break;
                }
            }

        }
        return result;
    }
}

public class workoutClothes {

    Solution solution;

    @BeforeEach
    public void 객체생성() {
        solution = new Solution();
    }

    @Test
    public void 테스트1() {
        int n = 5;
        int[] lost = new int[] { 2, 4 };
        int[] reserve = new int[] { 1, 3, 5 };
        int result = 5;
        assertEquals(solution.solution(n, lost, reserve), result);
    }

    @Test
    public void 테스트2() {
        int n = 5;
        int[] lost = new int[] { 2, 4 };
        int[] reserve = new int[] { 3 };
        int result = 4;

        assertEquals(solution.solution(n, lost, reserve), result);
    }

    @Test
    public void 테스트3() {
        int n = 3;
        int[] lost = new int[] { 3 };
        int[] reserve = new int[] { 1 };
        int result = 2;

        assertEquals(solution.solution(n, lost, reserve), result);
    }
}
