/*
class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        String ans ="";
        int c=0;
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch == '(')
            {
                if(c>0)
                {
                    ans=ans+ch;
                }
                c++;
            }
            else
            {
                c--;
                if(c>0)
                {
                    ans=ans+ch;
                }
            }
        }
        return ans;
    }
}
*/


class Solution {
    public String removeOuterParentheses(String s) {
        String ans = "";
        int open = 0;
        int close = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) 
        {
            if (s.charAt(i) == '(') 
            {
                open++;
            } 
            else 
            {
                close++;
            }
            if (open == close) 
            {
                for (int j = start + 1; j < i; j++) 
                {
                    ans = ans + s.charAt(j);
                }
                start = i + 1;
                open = 0;
                close = 0;
            }
        }
        return ans;
    }
}
