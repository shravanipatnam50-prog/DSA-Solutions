/*
class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            String sub="";
            for(int j = i; j < s.length(); j++)
            {
                char ch=s.charAt(j);
                if (sub.indexOf(ch) != -1) 
                {
                    break;
                }
                sub = sub + ch;
                if (sub.length() > max) {
                    max = sub.length();
                }
            }
        }
        return max;
    }
}*/



class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);

            for (int i = start; i < end; i++) {
                if (s.charAt(i) == ch) {
                    start = i + 1;
                    break;
                }
            }

            int length = end - start + 1;

            if (length > max) {
                max = length;
            }
        }

        return max;
    }
}
