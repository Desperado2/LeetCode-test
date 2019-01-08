package test.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Code_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Integer[] a = new Integer[nums.length];
        int left = 0;
        for (int i=0; i<nums.length; i++){
            a[nums[i]-1] = -1;
        }
        for (int i=0;i<a.length;i++){
            if(a[i] == null){
                a[i] = i+1;
                int temp = a[i];
                a[i] = a[left];
                a[left] = temp;
                left++;
            }
        }
        a = Arrays.copyOf(a,left);
        return Arrays.asList(a);
    }

    @Test
    public void test(){
        System.out.println(Arrays.toString(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}).toArray()));;
    }
}
