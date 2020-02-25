/*
https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
*/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int aPointer = 0;
        int bPointer = numbers.length - 1;

        while (aPointer <= bPointer) {
            int sum = numbers[aPointer] + numbers[bPointer];
            if (sum > target) {
                bPointer -= 1;
            } else if (sum < target) {
                aPointer += 1;
            } else {
                return new int[] { aPointer + 1, bPointer + 1 };
            }
        }
        return new int[] { aPointer + 1, bPointer + 1 };
    }
}