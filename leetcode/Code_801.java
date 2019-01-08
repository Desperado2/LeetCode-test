package test.leetcode;

import org.junit.Test;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Code_801 {

    // 1 3 5  8  7
    public int[] shortestToChar(String S, char C) {
        char[] chars = S.toCharArray();
        List<Integer> list = new ArrayList<>();
        for (int i=0;i< chars.length; i++){
            if(chars[i] == C){
                list.add(i);
            }
        }
        int [] result = new int[chars.length];
        for (int i=0;i<chars.length;i++){
            int min = Integer.MAX_VALUE;
            for (int j =0;j<list.size();j++){
                min = Math.min(min,Math.abs(list.get(j) - i));
            }
            result[i] = min;
        }
        return result;
    }

    @Test
    public void test(){
        System.out.println(Arrays.toString(shortestToChar("loveleetcode",'e')));
    }
}
