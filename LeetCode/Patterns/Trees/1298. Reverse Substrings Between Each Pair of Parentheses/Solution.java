class Solution {
    public String reverseParentheses(String s) {
        Stack<String> stack = new Stack<>();
        String current = "";
        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(current);
                current = "";
            }
            else if (ch == ')') {
                String reverse = "";
                int j = current.length() - 1;
                while (j >= 0) {
                    reverse = reverse + current.charAt(j);
                    j--;
                }
                current = stack.pop() + reverse;
            }
            else {
                current = current + ch;
            }
            i++;
        }
        return current;
    }
}