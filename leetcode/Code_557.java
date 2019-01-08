package test.leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Code_557 {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int end = 0;
        int begin = 0;
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] != ' ' && i < s.length() - 1) {
                end++;
            } else {
                if (i != s.length() - 1) {
                    end--;
                }
                for (int j = begin; j < (begin + i + 1) / 2; j++) {
                    char c = chars[j];
                    chars[j] = chars[end];
                    chars[end--] = c;
                }
                begin = i + 1;
                end = begin;
            }
        }
        return new String(chars);
    }

    @Test
    public void test() {
        String s = "Let's take LeetCode contest";
        String words = reverseWords(s);
        System.out.println(words);
    }
}
