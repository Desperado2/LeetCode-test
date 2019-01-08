package test.leetcode;

import org.junit.Test;

public class Code_693 {

    //  0111 1000
    public boolean hasAlternatingBits(int n) {
        int temp = n ^ (n>>1); //  0101  0010  0101  0111
        return (temp & (temp+1)) == 0;
    }

    @Test
    public void test(){
        System.out.println(hasAlternatingBits(5));
        System.out.println(hasAlternatingBits(7));
        System.out.println(hasAlternatingBits(11));
        System.out.println(hasAlternatingBits(10));
    }
}
