package test.leetcode;

import org.junit.Test;

import java.sql.SQLOutput;

public class Code_171 {
    public int titleToNumber(String s) {
        int result = 0;
        char[] chars = s.toCharArray();
        for (int i=chars.length-1;i>=0;i--){
            result += (int) (((int)chars[i]-64) *Math.pow(26,chars.length-1-i));
        }
        return result;
    }

    @Test
    public void test(){
        System.out.println((int)'A');
        System.out.println(titleToNumber("A"));
        System.out.println(titleToNumber("AB"));
        System.out.println(titleToNumber("ZY"));

    }
}
