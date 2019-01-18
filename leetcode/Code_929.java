package test.leetcode;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class Code_929 {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails){
            set.add(email.split("@")[0].split("\\+")[0].replaceAll("\\.","")+"@"+email.split("@")[1]);
        }

        return set.size();
    }

    @Test
    public void test(){
        String[] emails = new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));
    }
}
