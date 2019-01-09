package test.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code_728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i<= right; i++){
            if(check(i)){
                list.add(i);
            }
        }
        return list;
    }

    private boolean check(int num){
        int a  = num;
        while (a != 0){
            int b = a%10;
            if(b==0 || (num%b)!=0){
                return false;
            }
            a = a/10;
        }
        return true;
    }

    @Test
    public void test(){
        System.out.println(Arrays.toString(selfDividingNumbers(1,22).toArray()));
    }
}
