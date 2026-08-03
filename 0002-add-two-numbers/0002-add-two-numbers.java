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
        ListNode i=l1;
        ListNode j=l2;
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        int carry=0;
        while(i!=null && j!=null){
            int n=i.val+j.val+carry;
            if(n>9){
                n=n%10;
                carry=1;
            }
            else{
                carry=0;
            }
            ListNode a=new ListNode(n);
            temp.next=a;
            temp=a;
            i=i.next;
            j=j.next;
        }
        while(i!=null){
            int n=i.val+carry;
            if(n>9){
                n=n%10;
                carry=1;
            }
            else{
                carry=0;
            }
            ListNode a=new ListNode(n);
            temp.next=a;
            temp=a;
            i=i.next;
        }
        while(j!=null){
            int n=j.val+carry;
            if(n>9){
                n=n%10;
                carry=1;
            }
            else{
                carry=0;
            }
            ListNode a=new ListNode(n);
            temp.next=a;
            temp=a;
            j=j.next;
        }
        if(carry==1){
            ListNode a=new ListNode(1);
            temp.next=a;
            temp=a;
        }
        return dummy.next;


        
    }
}