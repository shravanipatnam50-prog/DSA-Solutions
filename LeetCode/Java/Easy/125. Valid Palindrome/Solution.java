class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String clean="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))//remove all spaces,puncuation and special symbols
            {
                clean+=ch;
            }
        }
        int left=0;
        int right=clean.length()-1;
        while(left<right)
        {
            if(clean.charAt(left) != clean.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

/*
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) 
        {
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if (!((c1 >= '0' && c1 <= '9') || (c1 >= 'a' && c1 <= 'z'))) 
            {
                i++;
                continue;
            }
            if (!((c2 >= '0' && c2 <= '9') || (c2 >= 'a' && c2 <= 'z'))) 
            {
                j--;
                continue;
            }
            if (c1 != c2) 
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}*/