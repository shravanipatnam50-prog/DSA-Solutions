/*
class Solution {
    public boolean isValid(String s) {

        while (s.length() > 0) {

            int left = 0;
            int right = 1;
            boolean found = false;

            while (right < s.length()) {

                if ((s.charAt(left) == '(' && s.charAt(right) == ')') ||
                    (s.charAt(left) == '[' && s.charAt(right) == ']') ||
                    (s.charAt(left) == '{' && s.charAt(right) == '}')) {

                    s = s.substring(0, left) + s.substring(right + 1);
                    found = true;
                    break;
                }

                left++;
                right++;
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }
}*/
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

/*
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
}*/




import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } 
            else {
                if (st.isEmpty()) {
                    return false;
                }

                char top = st.peek();

                if ((ch == ')' && top == '(') ||
                    (ch == '}' && top == '{') ||
                    (ch == ']' && top == '[')) {
                    st.pop();
                } 
                else {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}