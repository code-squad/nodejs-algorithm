import java.util.*;

/*
https://programmers.co.kr/learn/courses/30/lessons/12910
*/

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer.add(arr[i]);
            }
        }
        Collections.sort(answer);
        return convertIntegers(answer);
    }

    public static int[] convertIntegers(List<Integer> integers) {
        if (integers.size() == 0) {
            return new int[] { -1 };
        }
        int[] ret = new int[integers.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }
}