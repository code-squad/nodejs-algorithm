/*
https://leetcode.com/list?selectedList=xtcq66mm
*/

class Solution {
    public int trailingZeroes(int n) {
        if (n < 1) {
            return 0;
        }
        int answer = 0;
        for (long i = 5; i <= n; i *= 5) {
            answer += n / i;
        }
        return answer;
    }
}