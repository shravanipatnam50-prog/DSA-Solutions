class Solution {
    public int numOfSubarrays(int[] arr, int k, int th) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        if (sum / k >= th) {
            count++;
        }
        for (int i = k; i < arr.length; i++) 
        {
            sum = sum - arr[i - k] + arr[i];
            if (sum / k >= th) {
                count++;
            }
        }
        return count;
    }
}
