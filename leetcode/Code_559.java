package test.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Code_559 {
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

    public int maxDepth(Node root) {
        if(root == null){
            return 0;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int result = 0;
        int queueSize = 1;
        while (queue != null && queue.size() > 0) {
            result++;
            for (int i=0;i<queueSize;i++){
                Node poll = queue.poll();
                if (poll != null && poll.children != null) {
                    for (Node node : poll.children) {
                        queue.add(node);
                    }
                }
            }
           queueSize = queue.size();
        }
        return result;
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
        System.out.println(maxDepth(root));
    }

}
