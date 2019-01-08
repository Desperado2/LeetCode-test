package test.leetcode;

import org.junit.Test;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.Stack;

public class Code_682 {

    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<ops.length; i++){
            if(ops[i].equals("C")){
                stack.pop();
            }else if(ops[i].equals("D")){
                stack.push(stack.peek() * 2);
            }else if(ops[i].equals("+")){
                int a = stack.pop();
                int score = a + stack.peek();
                stack.push(a);
                stack.push(score);
            }else{
               stack.push(Integer.parseInt(ops[i]));
            }
        }
        int result = 0;
        for (Integer score : stack){
            result = result + score;
        }
        return result;
    }

    @Test
    public void test(){
        String[] ops = new String[]{"5","2","C","D","+"};
        String[] ops1 = new String[]{"5","-2","4","C","D","9","+","+"};
        String[] ops2 = new String[]{"36","28","70","65","C","+","33","-46","84","C"};
        System.out.println(calPoints(ops2));
    }
}
