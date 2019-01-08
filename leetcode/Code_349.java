package test.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Code_349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        int length = nums1.length > nums2.length?nums2.length:nums1.length;
        int[] ints = new int[length];
        int k =0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums1.length;i++){
            map.put(nums1[i],1);
        }

        for (int i =0; i< nums2.length ;i++){
            if(map.get(nums2[i]) != null && map.get(nums2[i]) != 2){
                map.put(nums2[i],2);
                ints[k++] = nums2[i];
            }
        }
        return Arrays.copyOf(ints,k);
    }

    @Test
    public void test(){
        int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
}
