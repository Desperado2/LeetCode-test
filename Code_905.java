package test;

import org.junit.Test;

import java.util.Arrays;

public class Code_905 {

    public int[] sortArrayByParity(int[] A){
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
        return A;
    }

    @Test
    public void test(){
        int[] A ={3,1,2,4,5,7,6,8,0};
        System.out.println(Arrays.toString(sortArrayByParity(A)));;
    }
}
