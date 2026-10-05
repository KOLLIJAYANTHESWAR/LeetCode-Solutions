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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode fin = new ListNode(0);
        ListNode curr=fin;
        int rem=0;
        while(l1!=null||l2!=null||rem!=0){
            int x=(l1!=null)?(l1.val):0;
            int y=(l2!=null)?(l2.val):0;

            int sum=x+y+rem;
            int dig=sum%10;
            rem=(int)sum/10;
            curr.next= new ListNode(dig);
            curr=curr.next;
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }
        return fin.next;
    }
}
