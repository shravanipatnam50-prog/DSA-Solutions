/*
class Solution {
    public boolean isValid(String s) {
        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
        }
        return s.length() == 0;
    }
}
*/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '{' || ch == '[' || ch == '(') {
                st.push(ch);
            }
            else if(st.isEmpty()) {
                return false;
            }
            else {
                char top = st.pop();
                if(ch == ')' && top != '(') {
                    return false;
                }
                if(ch == ']' && top != '[') {
                    return false;
                }
                if(ch == '}' && top != '{') {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}