
import java.util.*;

class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum = 0;
        int n = nums.size();

        for (int i = 0; i < n; i++) {
            int distinct = 0;

            for (int j = i; j < n; j++) {
                boolean found = false;

                for (int k = i; k < j; k++) {
                    if (nums.get(k).equals(nums.get(j))) {
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    distinct++;
                }

                sum += distinct * distinct;
            }
        }

        return sum;
    }
}
