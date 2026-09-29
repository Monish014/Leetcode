/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        String n="";
        while(head.next!=null){
            n+=String.valueOf(head.val);
            head=head.next;
        }
        n+=String.valueOf(head.val);
        return Integer.parseInt(n,2);
    }
}