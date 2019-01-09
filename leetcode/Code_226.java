package test.leetcode;

import org.junit.Test;

import java.util.*;

public class Code_226 {


    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        Integer queueSize =1;
        while (queue != null && queue.size() > 0){
            for (int i=0;i<queueSize;i++){
                TreeNode treeNode = queue.poll();
                if(treeNode != null){
                    TreeNode left = treeNode.left;
                    treeNode.left = treeNode.right;
                    treeNode.right = left;
                    queue.add(treeNode.left);
                    queue.add(treeNode.right);
                }
            }
            queueSize = queue.size();
        }
        return root;
    }


    public  void preOrderRecur(TreeNode head){
        if(head == null){
            return;
        }
        System.out.print(head.val+" ");
        preOrderRecur(head.left);
        preOrderRecur(head.right);
    }
    @Test
    public void test(){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        TreeNode treeNode = invertTree(root);
        preOrderRecur(treeNode);
    }
}
