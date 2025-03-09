class Solution {
    public int uniquePaths(int m, int n) {
        int[][] way_to_reach = new int[m][n];
        for(int i = 0; i < n; i++) way_to_reach[0][i] = 1;
        for(int i = 0; i < m; i++) way_to_reach[i][0] = 1;
        for(int row = 1; row < m; row++) {
            for(int col = 1; col < n; col++) {
                way_to_reach[row][col] = way_to_reach[row-1][col] + way_to_reach[row][col-1];
            }
        }
        return way_to_reach[m-1][n-1];
    }
}