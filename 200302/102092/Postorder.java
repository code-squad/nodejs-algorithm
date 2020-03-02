import java.util.LinkedList;
import java.util.List;

/*
https://leetcode.com/problems/n-ary-tree-postorder-traversal/
*/

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

class Solution {
    public List<Integer> postorder(Node root) {

        LinkedList<Node> stk = new LinkedList<>();
        LinkedList<Integer> out = new LinkedList<>();

        if (root == null) {
            return out;
        }

        stk.add(root);

        while (!stk.isEmpty()) {
            Node node = stk.pollLast();
            out.addFirst(node.val);

            for (Node child : node.children) {
                stk.add(child);
            }
        }
        return out;
    }
}