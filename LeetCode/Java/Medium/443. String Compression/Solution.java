class Solution {
    public int compress(char[] chars) {
        String ans = "";
        int count = 0;
        int i = 0;
        int j = 0;
        while (j < chars.length) 
        {
            if (chars[i] == chars[j]) 
            {
                count++;
                j++;
            }
            else {
                if (count == 1) 
                {
                    ans = ans + chars[i];
                }
                else 
                {
                    ans = ans + chars[i] + count;
                }
                i = j;
                count = 0;
            }
        }
        if (count == 1) 
        {
            ans = ans + chars[i];
        }
        else 
        {
            ans = ans + chars[i] + count;
        }
        for (int k = 0; k < ans.length(); k++) {
            chars[k] = ans.charAt(k);
        }
        return ans.length();
    }
}