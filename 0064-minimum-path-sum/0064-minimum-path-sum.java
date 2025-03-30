class Solution {
    public int minPathSum(int[][] arr) {
        for(int i = 1; i < arr.length; i++) {
            arr[i][0] = arr[i-1][0] + arr[i][0];
        }

        for(int j = 1; j < arr[0].length; j++) {
            arr[0][j] = arr[0][j-1] + arr[0][j];
        }

        for(int i = 1; i < arr.length; i++) {
            for(int j = 1; j < arr[0].length; j++) {
                arr[i][j] = Math.min(arr[i-1][j], arr[i][j-1]) + arr[i][j];
            }
        }
        return arr[arr.length-1][arr[0].length-1];
    }
}