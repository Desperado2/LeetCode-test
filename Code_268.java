package test;

import org.junit.Test;

public class Code_268 {
    public int missingNumber(int[] nums) {
        int dd = 0;
        int leg = nums.length;
        for (int i=0; i<nums.length;i++){
            dd +=nums[i];
        }
        return leg*(leg+1)/2 - dd;
    }

    @Test
    public void test(){
        System.out.println(missingNumber(new int[]{0,1}));
        System.out.println(missingNumber(new int[]{3,0,1}));
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }
}
