package test.leetcode;

import org.junit.Test;

public class Code_657 {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y= 0;
        char[] chars = moves.toCharArray();
        for (int i=0; i<chars.length; i++){
            if('L' == chars[i]){
                x--;
            }else if('R' == chars[i]){
                x++;
            }else if('U' == chars[i]){
                y++;
            }else{
                y--;
            }
        }
        if(x==0 && y==0){
            return true;
        }
        return false;
    }

    @Test
    public void  test(){
        System.out.println(judgeCircle("LL"));
    }
}
