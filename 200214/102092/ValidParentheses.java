/*
https://leetcode.com/problems/valid-parentheses/
*/

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

    Solution solution;

    class Solution {

        public boolean isValid(String s) {
            HashMap<Character, Character> hashMap = new HashMap<>();
            hashMap.put('(', ')');
            hashMap.put('[', ']');
            hashMap.put('{', '}');

            Stack<Character> stack = new Stack();

            for (int i = 0; i < s.length(); i++) {
                char target = s.charAt(i);
                if (target == '(' || target == '[' || target == '{') {
                    stack.add(target);
                } else {
                    if (stack.isEmpty() || hashMap.get(stack.peek()) != target) {
                        return false;
                    }
                    stack.pop();
                }

            }
            return stack.isEmpty();
        }
    }
}
