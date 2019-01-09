package test.leetcode;

import org.junit.Test;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class Code_429 {

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

    public List<List<Integer>> levelOrder(Node root) {
        if(root == null){
            return new ArrayList<>();
        }
        List<List<Integer>> lists = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int queueSize = 1;
        while (queue != null && queue.size() > 0) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < queueSize; i++) {
                Node node = ((LinkedList<Node>) queue).pop();
                if (node != null) {
                    list.add(node.val);
                    if(node.children != null){
                        for (Node node1 : node.children) {
                            queue.add(node1);
                        }
                    }
                }
            }
            lists.add(list);
            queueSize = queue.size();
        }
        return lists;
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
        node2.children = child2;

        List<List<Integer>> listList = levelOrder(root);
        for (List<Integer> list : listList){
            System.out.println(Arrays.toString(list.toArray()));
        }

    }
}
