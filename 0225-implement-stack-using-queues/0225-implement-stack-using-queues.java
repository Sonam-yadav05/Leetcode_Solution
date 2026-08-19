class MyStack {
    Queue<Integer> q =new LinkedList<>();
    Queue<Integer> helper =new LinkedList<>();
    public MyStack() {

    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        while(q.size()>1){
            helper.add(q.remove());
        }
        int top=q.remove();
        while(helper.size()>0){
            q.add(helper.remove());
        }
        return top;
    }
    
    public int top() {
        while(q.size()>1){
            helper.add(q.remove());
        }
        int top=q.remove();
        helper.add(top);
        while(helper.size()>0){
            q.add(helper.remove());
        }
        return top;    
    }
    
    public boolean empty() {
        return (q.size()==0);
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */