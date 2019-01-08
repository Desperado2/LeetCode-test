package test;

import org.junit.Test;

public class Code_896 {

    public boolean isMonotonic(int[] A) {
        int flag =0;
        for (int i=0; i<A.length-1;i++){
            if(A[i] > A[i+1]){
                if(flag ==0){
                    flag = 1;
                }
                if(flag == 2){
                    return false;
                }
            }else if(A[i] < A[i+1]){
                if(flag ==0){
                    flag =2;
                }
                if(flag == 1){
                    return false;
                }
            }
        }
        return true;
    }

    @Test
    public void test(){
        System.out.println(isMonotonic(new int[]{1,2,2,3}));
        System.out.println(isMonotonic(new int[]{6,5,5,4}));
        System.out.println(isMonotonic(new int[]{1,3,2}));
        System.out.println(isMonotonic(new int[]{1,2,4,5}));
        System.out.println(isMonotonic(new int[]{1,1,1}));
    }
}
