package test;

import org.junit.Test;

public class Code_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int lastMax = 0;
        int curMax =0;
        boolean flag = true;
        for (int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                curMax ++;
                flag =true;
            }else{
                if (flag){
                    lastMax = lastMax > curMax?lastMax:curMax;
                    curMax =0;
                }
                flag = false;
            }
        }
        return lastMax > curMax?lastMax:curMax;
    }

    @Test
    public void test(){
        int[] nums={1,1,0,1,0,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
