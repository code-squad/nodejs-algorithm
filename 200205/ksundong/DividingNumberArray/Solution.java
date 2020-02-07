import java.util.ArrayList;
import java.util.Arrays;

/**
 * [나누어 떨어지는 숫자 배열](https://programmers.co.kr/learn/courses/30/lessons/12910)
 * - [풀이](https://github.com/ksundong/algorithm-solution/blob/0007cfb4c168f48bf1f4597814fc715d6a33e685/src/main/java/dev/idion/programmers/dividingnumberarray/Solution.java)
 * - 별로 깊게 생각해보지 않아도 되는 문제였다.
 */
public class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> dividingArray = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) dividingArray.add(arr[i]);
        }
        if (dividingArray.isEmpty()) return new int[]{-1};

        int[] answer = new int[dividingArray.size()];
        for (int i = 0; i < dividingArray.size(); i++) {
            answer[i] = dividingArray.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
