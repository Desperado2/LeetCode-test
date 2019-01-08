package test;

import org.junit.Test;

import java.util.Arrays;

public class Code_27 {

    public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length <1){
            return 0;
        }
        int left = 0;
        int right = nums.length-1;
        int cur = 0;
        int count =0;
        while (left != right){
            if(nums[cur] != val){
                left++;
                cur++;
            }else{
                int temp = nums[right];
                nums[right] = nums[cur];
                nums[cur] = temp;
                right --;
            }
        }
        while (count < nums.length && nums[count] != val){
            count++;
        }
        return count;
    }

    @Test
    public void test(){
        int[] nums = {2};
        System.out.println(removeElement(nums,3));
    }
}
