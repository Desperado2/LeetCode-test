package test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code_119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        if (rowIndex == 0){
            return list;
        }else{
            for (int i=1; i<=rowIndex;i++){
                Long x = Long.valueOf(list.get(i-1) )* (rowIndex-i+1);
                x = x / i;
                list.add(i, x.intValue());
            }
        }
        return list;
    }

    @Test
    public void test(){
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Arrays.toString(getRow(30).toArray()));
    }
}
