
import java.util.*;

class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && prices[st.peek()] > prices[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                answer[i] = prices[i];
            } else {
                answer[i] = prices[i] - prices[st.peek()];
            }

            st.push(i);
        }

        return answer;
    }
}