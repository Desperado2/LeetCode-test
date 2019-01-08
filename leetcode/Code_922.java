package test.leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Code_922 {

    public int[] sortArrayByParityII(int[] A) {
        int left = 0;
        int right = A.length -1;
        int cur = 0;
        while (left != right){
            if(A[cur] % 2 == 0){
                left ++;
                cur ++;
            }else{
                int temp = A[right];
                A[right] = A[cur];
                A[cur] = temp;
                right--;
            }
        }
        left =1;right=A.length-2;
        while (left < right){
            int temp = A[right];
            A[right] = A[left];
            A[left] = temp;
            right = right-2;
            left = left+2;
        }
        return A;
    }

    @Test
    public void test(){
        int[] A ={3,1,2,4,5,7,6,8};
        System.out.println(Arrays.toString(sortArrayByParityII(A)));;
    }
}
