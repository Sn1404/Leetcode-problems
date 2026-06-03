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
    public ListNode reverseList(ListNode head) {
     ListNode cur = head, prev = null, n =null;
     while(cur!=null){
        n = cur.next;
        cur.next =prev;
        prev
         =cur;
        cur = n;
     }    
            return prev;
 }
}