import java.util.Stack;

/*
https://programmers.co.kr/learn/courses/30/lessons/42588
*/

class Solution {
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        Stack<Integer> stk = new Stack();
        int top;

        for (int i = 0; i < heights.length; i++) {
            stk.add(heights[i]);
        }

        while (!stk.isEmpty()) {
            top = stk.pop();

            for (int j = stk.size(); j >= 0; j--) {
                if (heights[j] > top) {
                    answer[stk.size()] = j + 1;
                    break;
                }
            }
        }

        return answer;
    }
}