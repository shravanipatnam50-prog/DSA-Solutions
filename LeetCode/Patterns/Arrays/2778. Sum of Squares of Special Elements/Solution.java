class Solution {
    public int sumOfSquares(int[] nums) {
        int sum_sq=0;
        int n=nums.length;
        for(int i=1;i<=n;i++)
        {
            if(n%i == 0)
            {
                sum_sq+=(nums[i-1]*nums[i-1]);
            }
        }
        return sum_sq;
    }
}