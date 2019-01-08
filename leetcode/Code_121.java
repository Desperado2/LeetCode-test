package test.leetcode;

import org.junit.Test;

public class Code_121 {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = Integer.MAX_VALUE;
        for (int i=0; i<prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }else if(prices[i] - min > maxProfit){
                maxProfit = prices[i] - min;
            }
        }
        return maxProfit;
    }

    @Test
    public void test(){
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
    }
}
