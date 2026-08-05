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
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode pre=null;
        ListNode fwd=null;
        while(curr!=null){
            fwd=curr.next;
            curr.next=pre;
            pre=curr;
            curr=fwd;
        }
        return pre;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        ListNode a=head;
        int size=0;
        while(a!=null){
            a=a.next;
            size++;
        }
        int count=size/k;
        ListNode i=head;
        while(count>=1){
           ListNode j=i;
           int n=1;
           while(n<k){
            j=j.next;
            n++;
           }
           ListNode l=j.next;
           j.next=null;
           j=reverse(i);
           temp.next=j;
           temp=j;
           while(temp.next!=null){
            temp=temp.next;
           }
           i=l;
           count--; 
        }
        temp.next=i;
        return dummy.next;
         
        
    }
}