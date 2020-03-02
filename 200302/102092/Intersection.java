import java.util.HashSet;
import java.util.Set;

/*
 * https://leetcode.com/problems/intersection-of-two-linked-lists
 */

public class Intersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;

        Set<ListNode> nodes = new HashSet<>();

        ListNode a = headA;
        ListNode b = headB;

        while (a != null) {
            nodes.add(a);
            a = a.next;
        }

        while (b != null) {
            if (nodes.contains(b)) {
                return b;
            }
            b = b.next;
        }
        return null;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}