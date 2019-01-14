package test.leetcode;

import org.junit.Test;

import java.util.*;

public class Code_973 {
    /**
     * 双层for循环
     * @param points
     * @param K
     * @return
     */
    public int[][] kClosest(int[][] points, int K) {
        int[][] result = new int[K][2];
        int maxX=0;
        result[0][0] = points[0][0];
        result[0][1] = points[0][1];
        for (int i=1; i<points.length; i++){
           if( i<K){
               result[i][0] = points[i][0];
               result[i][1] = points[i][1];
               if(Math.sqrt((points[i][0]*points[i][0])+(points[i][1]*points[i][1])) > Math.sqrt((result[maxX][0]*result[maxX][0]) + (result[maxX][1]*result[maxX][1]))){
                   maxX = i;
               }
           }else{
               if(Math.sqrt((points[i][0]*points[i][0])+(points[i][1]*points[i][1])) < Math.sqrt((result[maxX][0]*result[maxX][0]) + (result[maxX][1]*result[maxX][1]))){
                   result[maxX][0] = points[i][0];
                   result[maxX][1] = points[i][1];
                   for (int j =0; j<K;j++){
                       maxX = Math.sqrt((result[j][0]*result[j][0])+(result[j][1]*result[j][1])) > Math.sqrt((result[maxX][0]*result[maxX][0]) + (result[maxX][1]*result[maxX][1]))?j:maxX;
                   }
               }
           }
        }
        return result;
    }

    /**
     * 使用一个优先队列 （大顶堆）
     * @param points
     * @param K
     * @return
     */

    public int[][] kClosest2(int[][] points, int K) {
        Queue<Integer[][]> queue = new PriorityQueue<>(comparator);
        for (int i=0; i<points.length; i++){
            if(queue.size() < K){
                queue.add(new Integer[][]{{points[i][0],points[i][1]}});
            }else{
                Integer[][] peek = queue.peek();
                if(Math.sqrt((peek[0][0]*peek[0][0]) + (peek[0][1]*peek[0][1])) > Math.sqrt((points[i][0]*points[i][0]) + (points[i][1]*points[i][1]))){
                    queue.poll();
                    queue.add(new Integer[][]{{points[i][0],points[i][1]}});
                }
            }
        }
        int[][] result = new int[K][2];
        int size = queue.size();
        for (int i=0; i<=size ;i++){
            Integer[][] poll = queue.poll();
            result[i][0] = poll[0][0];
            result[i][1] = poll[0][1];
        }
        return result;
    }

    /**
     * 自定义比较器
     */
    private Comparator<Integer[][]> comparator = new Comparator<Integer[][]>() {
        @Override
        public int compare(Integer[][] o1, Integer[][] o2) {
            if( Math.sqrt((o2[0][0]*o2[0][0]) + (o2[0][1] * o2[0][1]))- Math.sqrt((o1[0][0]*o1[0][0]) + (o1[0][1] * o1[0][1])) > 0){
                return 1;
            }else if(Math.sqrt((o2[0][0]*o2[0][0]) + (o2[0][1] * o2[0][1]))- Math.sqrt((o1[0][0]*o1[0][0]) + (o1[0][1] * o1[0][1]))< 0){
                return -1;
            }else{
                return 0;
            }
        }
    };

    @Test
    public void test(){
        //int[][] arrays = {{68,97},{34,-84},{60,100},{2,31},{-27,-38},{-73,-74},{-55,-39},{62,91},{62,92},{-57,-67}};
        int[][] arrays = {{3,3},{5,-1},{-2,4}};
        int[][] kClosest = kClosest2(arrays, 2);
        for (int i=0 ;i<kClosest.length; i++){
            System.out.println(Arrays.toString(kClosest[i]));
        }
    }
}
