/*
 * https://leetcode.com/problems/merge-two-sorted-lists/submissions/
 * 
 * 
 * public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.val < l2.val){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
}
- 회귀를 이용해서 푸는 방법도 있구나.
 */

class Solution {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode answer, target;

        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        answer = new ListNode(0);
        target = answer;

        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                target.next = l2;
                l2 = l2.next;
            } else {
                target.next = l1;
                l1 = l1.next;
            }
            target = target.next;
        }

        if (l1 != null) {
            target.next = l1;
        }
        if (l2 != null) {
            target.next = l2;
        }
        return answer.next;

    }
}