/**
 * [같은 숫자는 싫어](https://programmers.co.kr/learn/courses/30/lessons/12906)
 * - 풀이는 했지만 공간복잡도가 높아지는 단점이 있다.
 * - Arrays.copyOf를 사용하지 않았더니 0.5 ms가 단축되었다.
 */
public class Solution {
    public int[] solution(int[] arr) {
        int tmp = -1;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != tmp) {
                count++;
            }
            tmp = arr[i];
        }

        tmp = -1;
        int tempCount = 0;
        int[] answer = new int[count];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != tmp) {
                answer[tempCount] = arr[i];
                tempCount++;
            }
            tmp = arr[i];
        }
        return answer;
    }
}
