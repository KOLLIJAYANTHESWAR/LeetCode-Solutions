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
        ListNode start = head;
        ListNode end = head;
        while(end!=null&&end.next!=null){
            start = start.next;
            end = end.next.next;
            if(start==end){
                ListNode ptr=head;
                while(ptr!=start){
                    ptr=ptr.next;
                    start=start.next;
                }
                return ptr;
            }
        }
        return null;
    }
}
