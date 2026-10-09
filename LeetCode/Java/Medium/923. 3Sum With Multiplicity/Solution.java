class Solution {
    public int threeSumMulti(int[] arr, int target) {
        int count = 0;
        int mod = 1000000007;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {

                    int sum = arr[i] + arr[j] + arr[k];

                    if (sum == target) {
                        count++;
                    }
                }
            }
        }
        return (int)(count % mod);
    }
}