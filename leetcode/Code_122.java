package test.leetcode;

import org.junit.Test;

public class Code_122 {
    public int maxProfit(int[] prices) {
        int sale = 0;
        for (int i=1;i<prices.length; i++){
            if(prices[i] > prices[i-1]){
                sale += prices[i] - prices[i-1];
            }
        }
        return sale;
    }

    @Test
    public void test(){
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(maxProfit(new int[]{1,2,3,4,5}));
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));
    }
}
