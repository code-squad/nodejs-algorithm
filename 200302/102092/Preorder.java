import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
 * https://leetcode.com/problems/n-ary-tree-preorder-traversal/
 */

/*
// Definition for a Node.
class Node {
   public int val;
   public List<Node> children;

   public Node() {}

   public Node(int _val) {
       val = _val;
   }

   public Node(int _val, List<Node> _children) {
       val = _val;
       children = _children;
   }
};
*/
class Solution {
    public List<Integer> preorder(Node root) {
        LinkedList<Node> stk = new LinkedList<>();
        LinkedList<Integer> out = new LinkedList<>();

        if (root == null) {
            return out;
        }

        stk.add(root);

        while (!stk.isEmpty()) {
            Node node = stk.pollLast();
            out.add(node.val);

            if (node.children != null) {
                Collections.reverse(node.children);
            }

            for (Node child : node.children) {
                stk.add(child);
            }
        }
        return out;
    }
}