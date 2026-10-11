
class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int[] diff = new int[n];

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
        }

        int k = k1 + k2;

        while (k > 0) {
            int max = 0;
            int index = -1;

            for (int i = 0; i < n; i++) {
                if (diff[i] > max) {
                    max = diff[i];
                    index = i;
                }
            }

            if (max == 0) {
                break;
            }

            diff[index]--;
            k--;
        }

        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += (long) diff[i] * diff[i];
        }

        return sum;
    }
}
