package test.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Code_679 {
    public int findShortestSubArray(int[] nums) {
        if(nums == null || nums.length==0){
            return 0;
        }
        if( nums.length ==1){
            return nums[0];
        }
        int[] a = new int[nums.length];
        int max = 0;
        for (int i=0; i<nums.length; i++){
            a[nums[i]-1] = a[nums[i]-1]+1;
        }
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<a.length; i++){
            if(a[i] > max){
                list.clear();
                max = a[i];
                list.add(i);
            }else if(a[i] == max){
                list.add(i);
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i=0;i<list.size();i++){
            int left =0;
            int right =0;
            int cur = nums[list.get(i)];
            max = a[list.get(0)];
            for (int j=0; j<nums.length; j++){
                if(max >0){
                    if(nums[j] == cur){
                        max--;
                        if(left == 0){
                            left = j+1;
                        }
                        right = j+1;
                    }
                }
            }
            if(right-left+1 < min){
                min = right-left+1;
            }
        }
        return min;
    }

    @Test
    public void test(){
        System.out.println( findShortestSubArray(new int[]{3,3,4}));
    }
}
