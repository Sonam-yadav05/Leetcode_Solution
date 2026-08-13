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
    public int length(ListNode head){
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        return len;
    }
    public int[] nextLargerNodes(ListNode head) {
        head=reverse(head);
        int size=length(head);
        ListNode temp=head;
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[size];
        ans[size-1]=0;
        int i=size-2;
        st.push(temp.val);
        temp=temp.next;
        while(temp!=null){
            while(st.size()>0 && st.peek()<=temp.val) st.pop();
            if(st.isEmpty()) ans[i--]=0;
            else ans[i--]=st.peek();
            st.push(temp.val);
            temp=temp.next;
        }
        return ans;
    }
}