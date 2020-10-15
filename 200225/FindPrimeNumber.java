/*
https://programmers.co.kr/learn/courses/30/lessons/12921
*/

import java.util.Arrays;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] nums = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            nums[i] = i;
        }

        for (int i = 2; i <= n; i++) {
            if (nums[i] == 0) {
                continue;
            }

            for (int j = 2 * i; j <= n; j += i) {
                nums[j] = 0;
            }
        }

        answer = (int) Arrays.stream(nums).filter(x -> x != 0).count();

        return answer;
    }
}