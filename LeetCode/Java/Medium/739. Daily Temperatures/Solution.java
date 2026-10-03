class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int[] ans = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            int j = i + 1;
            while(j < arr.length) {
                if(arr[j] > arr[i]) {
                    ans[i] = j - i;
                    break;
                }
                j++;
            }
        }
        return ans;
    }
}