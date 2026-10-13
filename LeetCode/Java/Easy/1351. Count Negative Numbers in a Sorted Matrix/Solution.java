class Solution {
    public int countNegatives(int[][] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                int num=arr[i][j];
                if(num<0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}