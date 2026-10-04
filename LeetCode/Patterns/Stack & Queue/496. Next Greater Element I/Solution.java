//Brute for with arrays
/*
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            int num=nums1[i];
            int greater=-1;
            for(int j=0;j<nums2.length;j++)
            {
                if(nums2[j]==num)
                {
                    for(int k=j+1;k<nums2.length;k++)
                    {
                        if(nums2[k]>num)
                        {
                            greater=nums2[k];
                            break;
                        }
                    }
                    break;
                }
            }
            ans[i]=greater;
        }
        return ans;
    }
}*/

//Optimal with stack
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
        Stack<Integer> st=new Stack<>();
        int[] next= new int[10001];
        for(int i=nums2.length-1;i>=0;i--)
        {
            int cur_num=nums2[i];
            while(!st.isEmpty() && st.peek()<=cur_num)
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                next[cur_num]=-1;
            }
            else
            {
                next[cur_num]=st.peek();
            }
            st.push(cur_num);
        }
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            ans[i]=next[nums1[i]];
        }
        return ans;
    }
}