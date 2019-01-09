package test.leetcode;



import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code_500 {
    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        List<Character> list1 = Arrays.asList(new Character[]{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'});
        List<Character> list2 = Arrays.asList(new Character[]{'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'});
        for (String word:words){
            char[] chars = word.toLowerCase().toCharArray();
            int flag = 0;
            for (int i=0;i<chars.length;i++){
                char c = chars[i];
                if(flag ==0){
                    if(list1.contains(c)){
                        flag =1;
                    }else if(list2.contains(c)){
                        flag =2;
                    }else{
                        flag = 3;
                    }
                }else{
                    int a = list1.contains(c)?1:list2.contains(c)?2:3;
                    if (a != flag){
                        flag = 0;
                        break;
                    }
                }
            }
            if(flag != 0){
                list.add(word);
            }
        }
        String[] a = new String[list.size()];
        return list.toArray(a);
    }

    @Test
    public void test(){
        String[] strings = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(findWords(strings)));
    }
}
