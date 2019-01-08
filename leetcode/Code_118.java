package test.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> item  = null;
        List<Integer> preItem  = null;
        for (int i=0;i<numRows;i++){
            item = new ArrayList<>();
            item.add(1);
            for (int j =0;j<i;j++){
                preItem = result.get(i-1);
                int pre = j-1;
                if(pre >= 0){
                    item.add(preItem.get(pre) + preItem.get(j));
                }
            }
            if(i > 0){
                item.add(1);
            }
            result.add(item);
        }
        return result;
    }

    @Test
    public void test(){
        List<List<Integer>> generate = generate(5);
        for (List<Integer> item : generate){
            System.out.println(Arrays.toString(item.toArray()));
        }
    }
}
