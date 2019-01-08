package test.leetcode;

import org.junit.Test;

public class Code_766 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i=0; i< matrix.length;i++){
            for (int j= 0;j <matrix[i].length;j++){
                if(i > 0 && j > 0){
                    if(matrix[i-1][j-1] != matrix[i][j]){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Test
    public void test(){
        //int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        int[][] matrix = {{1,2,3,4},{5,4,2,3},{9,5,1,2}};
        System.out.println(isToeplitzMatrix(matrix));
    }
}
