class Solution {
    public boolean hasValidPath(char[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        // Total length must be even
        if ((m + n - 1) % 2 != 0) {
            return false;
        }

        // First character must be '('
        if (grid[0][0] == ')') {
            return false;
        }

        boolean[][][] dp = new boolean[m][n][m + n];

        // Starting cell
        dp[0][0][1] = true;

        int i = 0;

        while (i < m) {

            int j = 0;

            while (j < n) {

                int balance = 0;

                while (balance < m + n) {

                    if (dp[i][j][balance]) {

                        // Move down
                        if (i + 1 < m) {

                            int newBalance = balance;

                            if (grid[i + 1][j] == '(') {
                                newBalance++;
                            } else {
                                newBalance--;
                            }

                            if (newBalance >= 0) {
                                dp[i + 1][j][newBalance] = true;
                            }
                        }

                        // Move right
                        if (j + 1 < n) {

                            int newBalance = balance;

                            if (grid[i][j + 1] == '(') {
                                newBalance++;
                            } else {
                                newBalance--;
                            }

                            if (newBalance >= 0) {
                                dp[i][j + 1][newBalance] = true;
                            }
                        }
                    }

                    balance++;
                }

                j++;
            }

            i++;
        }

        // At the last cell, balance must be 0
        return dp[m - 1][n - 1][0];
    }
}