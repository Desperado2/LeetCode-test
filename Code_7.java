package test;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Stack;

public class Code_7 {

    public static int reverse1(int x){
        int rev = 0;
        while (x != 0){
            int a = x % 10;
            x =x/10;
            if(rev > Integer.MAX_VALUE/10 || (rev==Integer.MAX_VALUE && a > 7)){
                return 0;
            }
            if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE && a < -8)){
                return 0;
            }
            rev = rev*10+a;
        }
        return rev;
    }

    public static int reverse(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        String result = "";
        Stack<Character> stack = new Stack<>();
        if(x>= 0 ){
            for (int i=0;i<chars.length;i++){
                stack.push(chars[i]);
            }
        }else{
            for (int i=1;i<chars.length;i++){
                stack.push(chars[i]);
            }
            stack.push('-');
        }
        while (!stack.empty()){
            result += stack.pop();
        }
        if(Long.valueOf(result) > Integer.MAX_VALUE || Long.valueOf(result) < Integer.MIN_VALUE){
            return 0;
        }
        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        int a = 24241;
        System.out.println(reverse1(a));

    }
}
