//Brute force
/*
class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set = new HashSet<>();
        int n=digits.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                    if(digits[i] != 0 && digits[k]%2 == 0 && i != j && j != k && k != i )
                    {
                        int num=digits[i]*100 + digits[j]*10 + digits[k];
                        set.add(num);
                    }
                }
            }
        }
        return set.size();
    }
}*/

//Optimal 
class Solution {
    public int totalNumbers(int[] digits) {

        int[] count = new int[10];

        // Count how many times each digit occurs
        for(int i = 0; i < digits.length; i++)
        {
            count[digits[i]]++;
        }

        int ans = 0;

        // Choose first digit
        for(int i = 1; i <= 9; i++)
        {
            if(count[i] == 0)
                continue;

            count[i]--;

            // Choose second digit
            for(int j = 0; j <= 9; j++)
            {
                if(count[j] == 0)
                    continue;

                count[j]--;

                // Choose last digit
                for(int k = 0; k <= 8; k += 2)
                {
                    if(count[k] > 0)
                    {
                        ans++;
                    }
                }

                count[j]++;
            }

            count[i]++;
        }

        return ans;
    }
}