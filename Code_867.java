package test;

import org.junit.Test;

import java.util.Arrays;

public class Code_867 {
    public int[][] transpose(int[][] A) {
        int row = A.length;
        int cel = A[0].length;
        int [][] B=new int[cel][row];
        for (int i= 0; i<A.length;i++){
            for (int j=0;j<A[i].length;j++){
                B[j][i] = A[i][j];
            }
        }
        return B;
    }

    @Test
    public void test(){
        int[][] A = {{1,2,3},{4,5,6}};
        int[][] image = transpose(A);
        for (int i=0; i<image.length;i++){
            System.out.println(Arrays.toString(image[i]));
        }

    }
}
