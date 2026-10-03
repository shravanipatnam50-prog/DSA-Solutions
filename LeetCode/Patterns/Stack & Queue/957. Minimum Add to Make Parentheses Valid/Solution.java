class Solution {
    public int minAddToMakeValid(String s) {
        int n=s.length();
        int open=0;
        int close=0;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch == '(')
            {
                open++;
            }
            else
            {
                close++;
            }
        } 
        if(open>close)
        {
            ans=open-close;
        }
        else
        {
            ans=close-open;
        }
        return ans;       
    }
}