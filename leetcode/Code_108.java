package test.leetcode;

public class Code_108 {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0){
            return null;
        }
        return bulidTree(nums,0,nums.length-1);
    }

    public TreeNode bulidTree(int[] nums, int l, int r){
        if(l > r){
            return null;
        }
        if(l == r){
            return new TreeNode(nums[l]);
        }
        int mid = (l+r)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = bulidTree(nums,l,mid-1);
        root.right = bulidTree(nums,mid+1,r);
        return root;
    }

}
