package test.leetcode;

import java.util.Arrays;
import java.util.List;

public class Code_237 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        String[] array = {"1", "2", "3", "4", "5"};
        List<String> list = Arrays.asList(array);
        list.add("6");
        System.out.println(list.size());
    }
}
