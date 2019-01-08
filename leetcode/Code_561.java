package test.leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Code_561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int min = 0;
        for (int i=0;i<nums.length;i=i+2){
            min += Math.min(nums[i],nums[i+1]);
        }
        return min;
    }

    @Test
    public void test(){
        int[] a ={3,1,2,4};
        System.out.println(arrayPairSum(a));
    }
}
