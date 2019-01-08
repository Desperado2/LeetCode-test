package test.leetcode;

import org.junit.Test;

public class Code_700 {

     public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null){
            if(root.val == val){
                return root;
            }else if(root.val > val){
                root = root.left;
            }else{
                root = root.right;
            }
        }
        return null;
    }

    @Test
    public void test(){

    }
}
