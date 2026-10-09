/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node head2 = deepcopy(head);
        HashMap<Node,Node> map = new HashMap<>();
        Node temp1 = head;
        Node temp2 = head2;
        while(temp1 != null && temp2 != null){
            map.put(temp1,temp2);
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        temp1 = head;
        while(temp1 != null){
            map.get(temp1).random = map.get(temp1.random);
            temp1 = temp1.next;
        }
        return head2;

    }
    public Node deepcopy(Node head){
        Node temp1 = head;
        Node dummy = new Node(0);
        Node temp2 = dummy;
        while(temp1 != null){
            Node t = new Node(temp1.val);
            temp2.next = t;
            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        return dummy.next;
    }
}