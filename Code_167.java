package test;

import org.junit.Test;

import java.util.Arrays;

public class Code_167 {
    public int[] twoSum(int[] numbers, int target) {
        int index1 = 0;
        int index2 = numbers.length-1;
        while (index1 < index2){
            int sum = numbers[index1] + numbers[index2];
            if(sum > target){
                index2 --;
            }else if(sum < target){
                index1 ++;
            }else{
                return new int[]{index1+1,index2+1};
            }
        }
        return new int[]{};
    }

    @Test
    public void test(){
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,13},9)));
        System.out.println(Arrays.toString(twoSum(new int[]{2,4,5,6},9)));
        System.out.println(Arrays.toString(twoSum(new int[]{2,3,4},9)));
    }
}
