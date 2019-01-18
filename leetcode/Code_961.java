package test.leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Code_961 {
    public int repeatedNTimes(int[] A) {
        int result = A[0];
        int[] res = new int[10000];
        for (int i :A){
            res[i]++;
            if(res[i] == A.length /2){
                result = i;
                break;
            }
        }
        return result;
    }

    public int repeatedNTimes1(int[] A) {
        Arrays.sort(A);
        return A[A.length/2] == A[A.length-1]?A[A.length-1] : A[A.length/2-1];
    }

    @Test
    public void test(){
        int[] A = new int[]{5,1,5,2,5,3,5,4};
        System.out.println(repeatedNTimes(A));
        System.out.println(repeatedNTimes1(A));
    }
}
