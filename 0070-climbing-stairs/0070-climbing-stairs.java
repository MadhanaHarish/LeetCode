class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        helper(2, n + 1, dp);
        return dp[n];
    }

    private void helper(int index, int maxPoss, int[] dp) {
        if(index == maxPoss) return;
        dp[index] = dp[index - 1] + dp[index - 2];
        helper(index + 1, maxPoss, dp);
    }
}