import java.util.*;

/*
 * https://leetcode.com/problems/contains-duplicate/submissions/
 */

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (hash.contains(nums[i]))
                return true;
            hash.add(nums[i]);
        }
        return false;
    }
}

// class Solution {
// public boolean containsDuplicate(int[] nums) {
// Arrays.sort(nums);

// for(int i = 0; i < nums.length -1 ; i++) {
// if(nums[i] == nums[i+1]) return true;
// }
// return false;
// }
// }
