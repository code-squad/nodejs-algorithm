/**
 * 프로그래머스 - 체육복(https://programmers.co.kr/learn/courses/30/lessons/42862)
 *  1. 일단 Test Case를 만들었다.
 *  2. 일단 배열의 length값을 빼고 더해보았다. (test 1, 3 실패)
 *  3. 만들어 둔 Test Case를 모두 만족하는 코드를 작성하였다.
 *  4. 예외 상황이 있어서(조건을 제대로 안읽어서) 코드를 수정했다. (먼저 같은 경우를 비교)
 */
public class Solution {
    // 전체 학생의 수 n, 도난당한 학생의 배열 lost, 여벌의 체육복을 가진 학생의 배열 reserve
    public int solution(int n, int[] lost, int[] reserve) {
        n -= lost.length;
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    n++;
                    lost[i] = 32;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j] + 1 || lost[i] == reserve[j] - 1) {
                    n++;
                    lost[i] = 32;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return n;
    }
}
