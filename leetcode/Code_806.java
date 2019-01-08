package test.leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Code_806 {
    public int[] numberOfLines(int[] widths, String S) {
        int j=0;
        int k =0;
        char[] chars = S.toCharArray();
        int result =0;
        for (int i =0; i< S.length() ;i++){
            int a = widths[(int)chars[i]-97];
             if(result + a > 100){
                 j++;
                 k = a;
                 result = a;
             }else{
                 k = k+ a;
                 result = result + a;
             }
        }
        return new int[]{j+1,k};
    }

    @Test
    public void test(){
        int [] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String S = "abcdefghijklmnopqrstuvwxyz";

        int[] widths1 = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String S1 = "bbbcccdddaaa";
        System.out.println(Arrays.toString(numberOfLines(widths1,S1)));
    }
}
