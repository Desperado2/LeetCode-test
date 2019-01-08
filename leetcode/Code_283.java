package test.leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Code_283 {

    public void moveZeroes(int[] nums) {
        int j =0;
        for (int i=0;i<nums.length; i++){
            if(nums[i] != 0){
                nums[j++] = nums[i];
            }
        }
        for (;j<nums.length;j++){
            nums[j] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void test(){
        int[] nums={0,1,0,3,12};
        moveZeroes(nums);

    }
}
