package test.leetcode;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class Code_804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] mors = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> strings = new HashSet<>();
        for (int i= 0; i<words.length; i++){
            char[] chars = words[i].toCharArray();
            String str ="";
            for (int j =0 ;j<chars.length; j++){
                str += mors[(int)chars[j]-97];
            }
            strings.add(str);
        }

        return strings.size();
    }


    @Test
    public void test(){
        String[] words = new String[]{"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }
}
