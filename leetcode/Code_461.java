package test.leetcode;

import org.junit.Test;

public class Code_461 {
    public int hammingDistance(int x, int y) {
        //Returns the number of one-bits in the two's complement binary
        return Integer.bitCount(x^y);
    }

    @Test
    public void test(){
        System.out.println(hammingDistance(1,4));
    }
}
