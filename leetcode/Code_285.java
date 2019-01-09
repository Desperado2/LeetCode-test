package test.leetcode;

import org.junit.Test;

public class Code_285 {
    public int addDigits(int num) {
        //f(x*10+y)=f(x*9+x+y)=f(x+y), 成立当f(x)= x%9
        return (num-1)%9+1;
    }

    @Test
    public void test(){
        System.out.println(addDigits(83));
    }
}
