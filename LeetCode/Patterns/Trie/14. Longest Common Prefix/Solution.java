class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min=Integer.MAX_VALUE;
        String ans="";
        String str="";
        for(String s: strs)
        {
            if(s.length()<min)
            {
                min=s.length();
                str=s;
            }
        }
        for(int i=0;i<min;i++)
        {
            for(int j=0;j<strs.length;j++)
            {
                if(strs[j].charAt(i)!=str.charAt(i))
                return ans;
            }
            ans+=str.charAt(i);
        }
        return ans;
    }
}
 



 /* class Solution {
    public String longestCommonPrefix(String[] s) 
    {
        String s1 = s[0];
        for(int i=0; i<s1.length(); i++) {
            char ch = s1.charAt(i);
            for(int j=1; j<s.length; j++) {
                if(i == s[j].length() || s[j].charAt(i) != ch) {
                    return s1.substring(0,i);
                }
            }

        }
        return s1;
    }
} */