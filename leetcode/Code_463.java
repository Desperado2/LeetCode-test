package test.leetcode;

import org.junit.Test;

public class Code_463 {

    public int islandPerimeter(int[][] grid) {
        int result =0;
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[i].length;j++){
                if(grid[i][j] ==1){
                    result += 4;
                    //如果grid[i+1][j]不超出数组并且也等于1（岛）则边减2
                    if(i + 1 < grid.length && grid[i + 1][j] == 1) {
                        result = result -2;
                    }
                    //如果grid[i][j+1]不超出数组并且也等于1（岛）则边减2
                    if(j + 1 < grid[i].length  && grid[i][j + 1] == 1) {
                        result = result -2;
                    }
                }
            }
        }
        return result;
    }

    @Test
    public void test(){
        int[][] grid = {
                {0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}
        };
        System.out.println(islandPerimeter(grid));
    }
}
