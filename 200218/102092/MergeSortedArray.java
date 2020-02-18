/*
https://leetcode.com/problems/merge-sorted-array/submissions/
*/

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == 0 && index < n) {
                nums1[i] = nums2[index];
                index++;
            }
        }
        Arrays.sort(nums1);
    }
}

/*
 * - 출제자가 의도한 해답은 아니었는 듯. 
 * - 처음 생각은 빈곳에 num2 배열 값을 넣고, Arrays.sort를 돌리자
 * 
 */

// public class Solution2 {
//     public void merge(int A[], int m, int B[], int n) {
//         int i = m - 1, j = n - 1, k = m + n - 1;
//         while (i >= 0 && j >= 0) {
//             A[k--] = A[i] > B[j] ? A[i--] : B[j--];
//         }
//         while (j >= 0) {
//             A[k--] = B[j--];
//         }
//     }
// }
