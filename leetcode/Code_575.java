package test.leetcode;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class Code_575 {
    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<candies.length; i++){
            set.add(candies[i]);
        }
        return Math.min(set.size(),candies.length/2);
    }

    @Test
    public void test(){
        int[] candies = {1,1,2,2,3,3};
        System.out.println(distributeCandies(candies));
    }
}
