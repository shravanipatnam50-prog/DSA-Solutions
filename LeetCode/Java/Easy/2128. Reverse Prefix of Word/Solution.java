class Solution {
    public String reversePrefix(String word, char ch) {
        int index=word.indexOf(ch);
        if(index == -1)
        {
            return word;
        }
        String first=word.substring(0,index+1);
        String second=word.substring(index+1);
        String rev="";
        for(int i=first.length()-1;i>=0;i--)
        {
            rev=rev+first.charAt(i);
        }
        return rev+second;
    }
}