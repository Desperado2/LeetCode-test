package test.leetcode;

import org.junit.Test;

import java.util.Stack;

public class Code_965 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isUnivalTree(TreeNode root) {
        if(root == null){
            return true;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        int last = root.val;
        while (!stack.isEmpty()){
            TreeNode pop = stack.pop();
            if(pop.val != last){
                return false;
            }else{
                if(pop.right != null ){
                    stack.push(pop.right);
                }
                if(pop.left != null){
                    stack.push(pop.left);
                }
            }
        }
        return true;
    }

    @Test
    public void test(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(1);
        System.out.println(isUnivalTree(root));
    }
}
