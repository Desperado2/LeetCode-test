package test.leetcode;

import org.junit.Test;

public class Code_908 {
    public int smallestRangeI(int[] A, int K) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0;i<A.length; i++){
            min = min < A[i]?min:A[i];
            max = max > A[i]?max:A[i];
        }

        int result =max - min;
        result = result >0?result-2*K:0;
        return result>0?result:0;
    }

    @Test
    public void test(){
        int[] A ={1};
        int K= 0;
        System.out.println(smallestRangeI(A,K));
    }
}
