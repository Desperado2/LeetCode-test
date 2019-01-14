package test.leetcode;

import org.junit.Test;

public class Code_852 {
    public int peakIndexInMountainArray(int[] A) {
        return calc(A,0,A.length-1);
    }

    private int calc(int[] A,int start, int end){
        int mid = (start+end)/2;
        if(A[mid] > A[mid - 1]){
            if(A[mid] > A[mid + 1]){
                return mid;
            }else{
                return calc(A, mid, end);
            }
        } else {
            return calc(A, start, mid);
        }
    }

    @Test
    public void test(){
        System.out.println(peakIndexInMountainArray(new int[]{0,1,0}));
    }
}
