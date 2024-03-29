/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {  
        ListNode n1=head;
        ListNode n2=head;
        ListNode n3=null;
            while(n2!=null && n2.next!=null)
            {
                n1=n1.next;
                n2=n2.next.next;
                if(n1==n2){
                  n3=head;
                while(n3!=n1){  
                    n3=n3.next;
                    n1=n1.next;
                }
                break;
            }
            }
        return n3;
}
}