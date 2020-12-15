package com.jagjit.Hactoberfest;

/**
 * https://leetcode.com/problems/climbing-stairs/ Runtime: 0 ms, faster than
 * 100.00% of Java online submissions for Climbing Stairs. Memory Usage: 33.2
 * MB, less than 5.26% of Java online submissions for Climbing Stairs.
 */
public class Solution {

	// below the function which returns count
	public int climbStairs(int n) {
		int[] dp = new int[n];
		if (n < 2) {
			return 1;
		}
		dp[0] = 1;
		dp[1] = 2;
		for (int i = 2; i < n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n - 1];
	}

}
