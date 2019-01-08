package test.leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Code_832 {

    public int[][] flipAndInvertImage(int[][] A){
        for (int i =0;i<A.length;i++){
            int left =0;
            int right= A[i].length-1;
            while (left <= right){
                if (left != right){
                    A[i][left] = A[i][left] == 1?0:1;
                }
                A[i][right] = A[i][right] == 1?0:1;
                int temp = A[i][left];
                A[i][left] = A[i][right];
                A[i][right] = temp;
                left++;
                right--;
            }
        }
        return A;
    }

    @Test
    public void test(){
        int[][] A = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int[][] image = flipAndInvertImage(A);
        for (int i=0; i<image.length;i++){
            System.out.println(Arrays.toString(image[i]));
        }

    }
}
