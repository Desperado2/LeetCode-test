package test.leetcode;

import org.junit.Test;

public class Code_344 {
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        for (int i=0;i<chars.length/2; i++){
            char c = chars[i];
            chars[i] = chars[chars.length-1-i];
            chars[chars.length-1-i] = c;
        }
        return new String(chars);
    }

    @Test
    public void test(){
        String s ="A man, a plan, a canal: Panama";
        System.out.println(reverseString(s));
    }
}
