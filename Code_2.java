package test;

public class Code_2 {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int cur = 0;
        ListNode head = new ListNode(0);
        ListNode curNode = head;
        while (l1 != null && l2 != null){
            int a  = (cur + l1.val+l2.val)>9?(cur+l1.val+l2.val-10):cur+l1.val+l2.val;
            curNode.next = new ListNode(a);
            cur = cur+l1.val+l2.val > 9?1:0;
            l1 = l1.next;
            l2 = l2.next;
            curNode = curNode.next;
        }
        while (l1 != null){
            int a = cur + l1.val > 9?(cur+l1.val-10):cur+l1.val;
            curNode.next = new ListNode(a);
            cur = cur + l1.val > 9?1:0;
            l1 = l1.next;
            curNode = curNode.next;
        }
        while (l2 != null){
            int a = cur + l2.val > 9?(cur+l2.val-10):cur+l2.val;
            curNode.next = new ListNode(a);
            cur = cur + l2.val > 9?1:0;
            l2 = l2.next;
            curNode = curNode.next;
        }
        if(cur != 0){
            curNode.next = new ListNode(cur);
        }
        return head.next;
    }

    public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode curNode = head;
        int cur = 0;
        while (l1 != null ||l2 != null){
            int x = l1 == null?0:l1.val;
            int y = l2 == null?0:l2.val;
            curNode.next = new ListNode((cur+x+y)%10);
            cur = (cur+x+y)/10;
            curNode = curNode.next;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        if(cur >0){
            curNode.next = new ListNode(cur);
        }
        return head.next;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
       /* l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);*/

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
      /*  l2.next.next = new ListNode(4);
*/
        ListNode node = addTwoNumbers1(l1, l2);
        while (node != null){
            System.out.print(node.val + "->");
            node = node.next;
        }
    }

}
