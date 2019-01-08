package test;

import org.junit.Test;

import java.util.Arrays;

public class Code_566 {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums.length * nums[0].length != r*c){
            return nums;
        }
        int[][] newNums = new int[r][c];
        int row = 0;
        int cel =0;
        for (int i =0;i <nums.length;i++){
            for (int j=0; j<nums[i].length;j++){
                if(cel >= c){
                    row++;
                    cel = 0;
                }
                newNums[row][cel++] = nums[i][j];
            }
        }
        return newNums;
    }

    @Test
    public void test(){
        int[][] A = {{1,2},{3,4}};
        int[][] image = matrixReshape(A,1,4);
        for (int i=0; i<image.length;i++){
            System.out.println(Arrays.toString(image[i]));
        }

    }
}
