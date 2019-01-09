package test.leetcode;

import org.junit.Test;

import java.util.*;

public class Code_107 {



    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        Stack<List<Integer>> stack = new Stack<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        Integer queueSize =1;
        while (queue != null && queue.size() > 0){
            List<Integer> list = new ArrayList<>();
            for (int i=0;i<queueSize;i++){
                TreeNode treeNode = ((LinkedList<TreeNode>) queue).pop();
                if(treeNode != null){
                    list.add(treeNode.val);
                    queue.add(treeNode.left);
                    queue.add(treeNode.right);
                }
            }
            queueSize = queue.size();
            if(list.size() > 0){
                stack.push(list);
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        while (stack.size() > 0){
            list.add(stack.pop());
        }
        return list;
    }

    @Test
    public void test(){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> listList = levelOrderBottom(root);
        for (List<Integer> list : listList){
            System.out.println(Arrays.toString(list.toArray()));
        }
    }

}
