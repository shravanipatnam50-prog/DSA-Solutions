/*
class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int[] ans = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            int j = i + 1;
            while(j < arr.length) {
                if(arr[j] > arr[i]) {
                    ans[i] = j - i;
                    break;
                }
                j++;
            }
        }
        return ans;
    }
}*/
import java.util.*;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() &&
                   temperatures[st.peek()] <= temperatures[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = 0;
            } else {
                ans[i] = st.peek() - i;
            }
            st.push(i);
        }
        return ans;
    }
}