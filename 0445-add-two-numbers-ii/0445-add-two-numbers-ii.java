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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=reverse(l1);
        l2=reverse(l2);
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode dummy=new ListNode(0);
        ListNode i=dummy;
        int carry=0;
        while(temp1!=null && temp2!=null){
            int n=temp1.val+temp2.val+carry;
            if(n>9) carry=1;
            else carry=0; 
            n=n%10;
            ListNode j=new ListNode(n);
            i.next=j;
            i=j;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        while(temp1!=null){
            int n= temp1.val+carry;
            if(n>9) carry=1;
            else carry=0;
            n=n%10;
            ListNode j=new ListNode(n);
            i.next=j;
            i=j;
            temp1=temp1.next;
        }
        while(temp2!=null){
            int n= temp2.val+carry;
            if(n>9) carry=1;
            else carry=0;
            n=n%10;
            ListNode j=new ListNode(n);
            i.next=j;
            i=j;
            temp2=temp2.next;
        }
        if(carry==1){
            ListNode j=new ListNode(1);
            i.next=j;
            i=j;
        }
        ListNode head=reverse(dummy.next);
        return head;

        
    }
}