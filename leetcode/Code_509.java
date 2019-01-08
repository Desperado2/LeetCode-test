package test.leetcode;

import org.junit.Test;

public class Code_509 {
    public int fib(int N) {
        int last =0;
        int laster = 1;
        int result =1;
        if(N ==0){
            return 0;
        }
        if(N ==1 || N==2){
            return 1;
        }
        for (int i=3;i<=N;i++){
            result += last + laster;
            int a = laster;
            laster = last;
            last = a+last;
        }
        return result;
    }

    @Test
    public void  test(){
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));
        System.out.println(fib(6));
    }
}
