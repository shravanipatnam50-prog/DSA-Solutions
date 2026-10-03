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