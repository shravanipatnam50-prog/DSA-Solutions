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