//Brute force
/*
class Solution {
    public int findMaxK(int[] nums) {
        int max=-1;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j] == 0)
                {
                   int k=Math.abs(nums[i]);
                   if(k>max)
                   {
                        max=k;
                   }
                }
            }
        }
        return max;
    }
}*/


class Solution {
    public int findMaxK(int[] nums) 
    {
        HashSet<Integer> set=new HashSet<>();
        int max=-1;
        for(int i=0;i<nums.length;i++) 
        {
            if(set.contains(-nums[i])) 
            {
                max=Math.max(max,Math.abs(nums[i]));
            }
            set.add(nums[i]);
        }
        return max;
    }
}