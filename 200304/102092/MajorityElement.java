import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/majority-element/submissions/
*/

class Solution {
    public int majorityElement(int[] nums) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
            if (map.get(num) > nums.length / 2) {
                result = num;
                break;
            }
        }
        return result;

    }
}