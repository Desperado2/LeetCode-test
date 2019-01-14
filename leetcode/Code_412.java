package test.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code_412 {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i=1;i<=n; i++){
            if(i % 15 ==0){
                list.add("FizzBuzz");
            }else if(i % 5 ==0){
                list.add("Buzz");
            }else if(i % 3 == 0){
                list.add("Fizz");
            }else{
                list.add(i+"");
            }
        }
        return list;
    }

    @Test
    public void test(){
        System.out.println(Arrays.toString(fizzBuzz(15).toArray()));
    }
}
