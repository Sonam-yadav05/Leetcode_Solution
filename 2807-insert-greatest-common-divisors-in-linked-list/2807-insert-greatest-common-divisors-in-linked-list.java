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
    public int hcf(int i,int j){
        int min=Math.min(i,j);
        int gcd=1;
        while(min>1){
            if(i%min==0 && j%min==0){
                gcd=min;
                break;
            }
            min--;
        }
        return gcd;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null) return head;
        ListNode i=head;
        ListNode j=head.next;
        while(j!=null){
            int gcd=hcf(i.val,j.val);
            ListNode t=new ListNode(gcd);
            t.next=j;
            i.next=t;
            i=j;
            j=j.next;
        }
        return head;
    
        
    }
}