package test.leetcode;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Code_617 {

  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null){
            return t2;
        }
        if(t2 == null){
            return t1;
        }
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left,t2.left);
        t1.right = mergeTrees(t1.right,t2.right);
        return t1;
    }

    @Test
    public void test(){
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(3);
        t1.right = new TreeNode(2);
        t1.left.left = new TreeNode(5);

        TreeNode t2 = new TreeNode(2);
        t2.left = new TreeNode(1);
        t2.right = new TreeNode(3);
        t2.left.right = new TreeNode(4);
        t2.right.right = new TreeNode(7);

        print(mergeTrees(t1,t2));
    }


    /**
     * 按层打印
     * @param root
     */
    private void print(TreeNode root){
        if (root == null) {
            return ;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int size = 1;
        while (!queue.isEmpty()) {
            if (size > 0) {
                TreeNode node = queue.poll();
                if(node != null){
                    if (node.left != null) {
                        queue.add(node.left);
                    }else{
                        queue.add(null);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }else{
                        queue.add(null);
                    }
                    System.out.print(node.val+"\t");
                    size--;
                }else{
                    System.out.print("null"+"\t");
                    size--;
                }

            } else {
                size = queue.size();
                System.out.println(" ");
            }
        }
    }
}
