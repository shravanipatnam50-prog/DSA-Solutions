class Solution {
    public int calPoints(String[] s) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("C")) {
                st.pop();
            }
            else if (s[i].equals("D")) {
                int num = st.peek();
                st.push(num * 2);
            }
            else if (s[i].equals("+")) {
                /*int top = st.pop();
                int second = st.peek();
                st.push(top);
                st.push(top + second);*/
                int a = st.pop();
                int b = st.pop();
                st.push(b);
                st.push(a);
                st.push(a+b);
            }
            else {
                int num = Integer.parseInt(s[i]);
                st.push(num);
            }
        }
        int sum = 0;
        while (!st.isEmpty()) {
            sum += st.pop();
        }
        return sum;
    }
}