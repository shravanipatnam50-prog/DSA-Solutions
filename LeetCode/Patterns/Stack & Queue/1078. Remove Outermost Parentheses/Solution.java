class Solution {
    public String removeOuterParentheses(String s) {
        String ans = "";
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') 
            {
                if (c > 0) 
                {
                    ans = ans + ch;
                }
                c++;
            } 
            else 
            {
                c--;
                if (c > 0) 
                {
                    ans = ans + ch;
                }
            }
        }
        return ans;
    }
}