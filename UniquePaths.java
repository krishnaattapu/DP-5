// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


/*
 * 1. Use bottom up DP.
 * 2. at the last square (m-1,n-1) it has only one possibility.
 * 3. for all other index down and right possibilities addition. 
 */

public class UniquePaths {
	public int uniquePaths(int m, int n) {

		int[][] dp = new int[m + 1][n + 1];
		dp[m - 1][n - 1] = 1;
		for (int i = m - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {
				if (i == m - 1 && j == n - 1)
					continue;
				dp[i][j] = dp[i][j + 1] + dp[i + 1][j];
			}
		}
		return dp[0][0];
	}
}
