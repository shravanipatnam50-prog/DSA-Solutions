class Solution {
    public int search(int[] nums, int k) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Target found
            if (nums[mid] == k) {
                return mid;
            }

            // RIGHT HALF IS SORTED
            if (nums[mid] <= nums[right]) {

                if (nums[mid] < k && k <= nums[right]) 
                {
                    // Target is in right half
                    left = mid + 1;
                }
                else {
                    // Target is in left half
                    right = mid - 1;
                }
            }

            // LEFT HALF IS SORTED
            else {

                if (nums[left] <= k && k < nums[mid]) {
                    // Target is in left half
                    right = mid - 1;
                }
                else {
                    // Target is in right half
                    left = mid + 1;
                }
            }
        }

        return -1;
    }
}

/*
class Solution {
    public int search(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
*/