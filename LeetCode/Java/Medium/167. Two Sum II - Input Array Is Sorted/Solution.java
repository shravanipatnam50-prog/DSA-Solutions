/* class Solution {
    public int[] twoSum(int[] num, int target) {
        for(int i=0;i<num.length;i++)
        {
            for(int j=i+1;j<num.length;j++)
            {
                if(num[i]+num[j] == target)
                {
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{-1,-1};
    }
} */

class Solution 
{
    public int[] twoSum(int[] num, int target) 
    {
        int left=0;
        int right=num.length-1;
        while(left<right)
        {
            int sum=num[left]+num[right];
            if(sum == target)
            {
                return new int[]{left+1,right+1};
            }
            else if(sum>target)
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        return new int[]{-1,-1};
    }
}