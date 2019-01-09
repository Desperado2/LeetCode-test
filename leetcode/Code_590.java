package test.leetcode;

import code_04.PreInPosTraversal;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Code_590 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    ;

    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null)
            return res;
        Stack<Node> stack = new Stack<Node>();
        Node pre = null;
        stack.push(root);
        while(!stack.isEmpty()){
            Node curr = stack.peek();
            if((curr.children == null)||(curr.children.size() == 0)||(pre != null && (curr.children.contains(pre)))){
                res.add(curr.val);
                pre = curr;
                stack.pop();
            }else{
                for(int i = curr.children.size()-1;i>=0;i--){
                    stack.push(curr.children.get(i));
                }
            }
        }
        return res;
    }

    @Test
    public void test() {
        Node root = new Node(1, null);
        Node node1 = new Node(3, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(4, null);
        Node node4 = new Node(5, null);
        Node node5 = new Node(6, null);
        List<Node> child1 = new ArrayList<>();
        child1.add(node1);
        child1.add(node2);
        child1.add(node3);
        root.children = child1;
        List<Node> child2 = new ArrayList<>();
        child2.add(node4);
        child2.add(node5);
        node1.children = child2;
        System.out.println(postorder(root));
    }
}
