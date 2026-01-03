class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> dp = new ArrayList<>();
        helper(1, rowIndex + 1, dp);
        return dp.get(rowIndex);
    }

    private void helper(int row, int numRows, List<List<Integer>> dp) {
        if (row > numRows) return;   

        List<Integer> currentRow = new ArrayList<>();
        currentRow.add(1);           

        for (int i = 1; i < row - 1; i++) {
            int num = dp.get(row - 2).get(i - 1) + dp.get(row - 2).get(i);
            currentRow.add(num);
        }

        if (row > 1) {
            currentRow.add(1);       
        }

        dp.add(currentRow);          
        helper(row + 1, numRows, dp);
    }    

}