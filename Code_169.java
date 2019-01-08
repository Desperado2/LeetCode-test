package test;

import org.junit.Test;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Code_169 {
    public int majorityElement(int[] nums) {
        int majority = 0;
        int count =0;
        for (int num : nums){
            if(count == 0){
                majority = num;
                count ++;
            }else{
                if(majority == num){
                    count ++;
                }else {
                    count --;
                }
            }
            if(count > nums.length/2){
                return majority;
            }
        }
        return majority;
    }

    @Test
    public void test(){
        int[] a ={3,3,4};
        System.out.println(majorityElement(a));;
    }
}
