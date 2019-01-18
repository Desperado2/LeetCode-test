package test.leetcode;

public class Code_771 {
    public int numJewelsInStones(String J, String S) {
        char[] charsJ = J.toCharArray();
        char[] charsS = S.toCharArray();
        int result = 0;
        for (int i=0;i<charsJ.length; i++){
            for (int j=0; j<charsS.length; j++){
                if(charsJ[i] == charsS[j]){
                    result++;
                }
            }
        }
        return result;
    }
}
