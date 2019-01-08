package test;

import org.junit.Test;

import java.util.*;

public class Code_811 {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer> map = new HashMap<>();
        for (String s : cpdomains){
            String[] strings = s.split(" ");
            String[] split = strings[1].split("\\.");
            if(split.length == 3){
                String str = strings[1];
                if(map.get(str) != null){
                    map.put(str,map.get(str)+Integer.parseInt(strings[0]));
                }else{
                    map.put(str,Integer.parseInt(strings[0]));
                }

                str = split[1]+"."+split[2];
                if(map.get(str) != null){
                    map.put(str,map.get(str)+Integer.parseInt(strings[0]));
                }else{
                    map.put(str,Integer.parseInt(strings[0]));
                }
                str = split[2];
                if(map.get(str) != null){
                    map.put(str,map.get(str)+Integer.parseInt(strings[0]));
                }else{
                    map.put(str,Integer.parseInt(strings[0]));
                }
            }else{
                String str = strings[1];
                if(map.get(str) != null){
                    map.put(str,map.get(str)+Integer.parseInt(strings[0]));
                }else{
                    map.put(str,Integer.parseInt(strings[0]));
                }

                str = split[1];
                if(map.get(str) != null){
                    map.put(str,map.get(str)+Integer.parseInt(strings[0]));
                }else{
                    map.put(str,Integer.parseInt(strings[0]));
                }
            }
        }

        List<String> list = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()){
            list.add(entry.getValue()+" "+entry.getKey());
        }
        return list;
    }

    @Test
    public void test(){
        String[] strings = {"9001 discuss.leetcode.com"};
        String[] strings1 = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        System.out.println(Arrays.toString(subdomainVisits(strings1).toArray()));
    }
}
