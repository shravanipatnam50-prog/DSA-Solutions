class Solution {
    public boolean isPalindromic(String s) {
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int ascii=ch;
            String b = Integer.toBinaryString(ascii);
            while(b.length()<8)
            {
                b="0"+b;
            }
            String rev="";
            for (int j = b.length()-1; j>=0; j--) 
            {
                rev=rev+b.charAt(j);
            }
            if(!b.equals(rev)) 
            {
                return false;
            }
        }
        return true;
    }
}
