class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        st.push(Integer.parseInt(operations[0]));

        for (int i = 1; i < operations.length; i++) {

            if (operations[i].equals("C")) {
                st.pop();
            }
            else if (operations[i].equals("D")) {
                st.push(st.peek() * 2);
            }
            else if (operations[i].equals("+")) {
                int x = st.pop();
                int y = st.peek();

                st.push(x);
                st.push(x + y);
            }
            else {
                st.push(Integer.parseInt(operations[i]));
            }
        }

        int sum = 0;

        while (!st.isEmpty()) {
            sum += st.pop();
        }

        return sum;
    }
}