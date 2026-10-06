class Solution {
    public String compressedString(String word) {
        String ans = "";
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < word.length()) {
            char ch = word.charAt(i);
            if (j < word.length() && word.charAt(j) == ch && count < 9) 
            {
                count++;
                j++;
            }
            else {
                ans = ans + count + ch;
                i = j;
                count = 0;
            }
        }
        return ans;
    }
}