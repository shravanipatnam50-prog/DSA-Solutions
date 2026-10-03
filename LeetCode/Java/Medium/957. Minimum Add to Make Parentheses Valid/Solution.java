/*
class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        int count = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                count++;
            } else {
                if (count > 0) {
                    count--;
                } else {
                    ans++;
                }
            }
        }
        ans = ans + count;
        return ans;
    }
}
*/


class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
        int close = 0;
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                open++;
            } else {
                close++;
                if (close > open) {
                    ans++;
                    open++;
                }
            }
        }
        ans = ans + (open - close);
        return ans;
    }
}