/*
https://programmers.co.kr/learn/courses/30/lessons/12906
*/

import java.util.ArrayList;
import java.util.List;

public class NotSameNumber {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int num = 10;
        for (int i = 0; i < arr.length; i++) {
            if (num != arr[i]) {
                list.add(arr[i]);
            }
            num = arr[i];
        }
        int[] answer = list.stream().mapToInt(Number::intValue).toArray();
        return answer;
    }
}