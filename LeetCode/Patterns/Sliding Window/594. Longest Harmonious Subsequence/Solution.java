
import java.util.Arrays;

class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);

        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[j] - nums[i] == 1) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }

                if (nums[j] - nums[i] > 1) {
                    break;
                }
            }
        }

        return maxLength;
    }
}
