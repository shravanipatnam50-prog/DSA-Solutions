class Solution {
    public int minimumDifference(int[] nums, int k) {

        Arrays.sort(nums);

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < k; i++) {
            int sub = nums[i] - nums[0];

            if(sub < min) {
                min = sub;
            }
        }

        for(int i = 1; i <= nums.length - k; i++) {
            int sub = nums[i + k - 1] - nums[i];

            if(sub < min) {
                min = sub;
            }
        }

        return min;
    }
}