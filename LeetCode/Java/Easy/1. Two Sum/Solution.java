/* class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for( int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
} */
//but not working in two
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                return new int[]{nums[i], nums[j]};
            }
            else if (sum < target) {
                i++;
            }
            else {
                j--;
            }
        }
        return new int[]{};
    }
}