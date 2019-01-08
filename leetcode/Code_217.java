package test.leetcode;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class Code_217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<nums.length; i++){
           if(set.contains(nums[i])){
               return true;
           }
           set.add(nums[i]);
        }
        return false;
    }

    @Test
    public void test(){
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
        System.out.println( containsDuplicate(new int[]{1,2,1,2}));
    }
}
