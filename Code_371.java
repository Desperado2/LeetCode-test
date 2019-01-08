package test;

import org.junit.Test;

public class Code_371 {
    public int getSum(int a, int b) {
        return b!=0?getSum(a^b,(a&b)<<1):a;
    }

    @Test
    public void test(){
        System.out.println(getSum(1,2));
        System.out.println(2^3);
        System.out.println((2&3)<<1);
    }
}
