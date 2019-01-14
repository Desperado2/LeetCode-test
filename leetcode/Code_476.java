package test.leetcode;

import org.junit.Test;

public class Code_476 {

    public int findComplement(int num) {
        // ~num  二进制按位取反
        //  Integer.highestOneBit(num) 二进制中最高的为一的哪一位为1，其余为0
        // 例： num=(0101)  ~num=（1010）   Integer.highestOneBit(num) = 0100
        // 1010 & 0011 = 0010 = 2
        return ~num&(Integer.highestOneBit(num)-1);
    }

    @Test
    public void test(){
        System.out.println(findComplement(5));
         // 例： num=(0001)  ~num=（1110）   Integer.highestOneBit(num) = 0001
         // 1110 & 0000 = 0000 = 0
        System.out.println(findComplement(1));
    }
}
