package test.leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Code_942 {
    public int[] diStringMatch(String S) {
        int N = S.length();
        int[] result = new int[N+1];
        char[] chars = S.toCharArray();
        int iIndex = 0;
        int dIndex = N;
        for (int i=0;i<N;i++){
            if('I' == chars[i]){
                result[i] = iIndex++;
            }else {
                result[i] = dIndex--;
            }
        }
        if(chars[N-1] == 'I'){
            result[N] = result[N-1]+1;
        }else {
            result[N] = result[N-1] -1;
        }
        return result;
    }

    @Test
    public void test(){
        System.out.println(Arrays.toString(diStringMatch("IDID")));
    }
}
