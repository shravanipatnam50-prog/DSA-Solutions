class Solution {
    public int minimumRecolors(String s, int k) {
        int count=0;
        for(int i=0;i<k;i++)
        {
            if(s.charAt(i) == 'W')
            {
                count++;
            }
        }
        int min=count;
        for(int i=k;i<s.length();i++)
        {
            if(s.charAt(i - k) == 'W')
            {
                count--;
            }
            if(s.charAt(i) == 'W') 
            {
                count++;
            }
            if(count<min)
            {
                min=count;
            }
        }
        return min;
    }
}