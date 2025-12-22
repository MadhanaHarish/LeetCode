class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> prevRow = new ArrayList<>(Arrays.asList(1));

        if(numRows > 0) {
            ans.add(prevRow);
        }

        int lastIndex = numRows - 1;

        for(int i = 1; i < numRows; i++) {
            List<Integer> currentRow= new ArrayList<>();
            currentRow.add(1);
            int currentIndex = currentRow.size();
            while(currentIndex < prevRow.size()) {
                currentRow.add(prevRow.get(currentIndex - 1) + prevRow.get(currentIndex));
                currentIndex++;
            }
            currentRow.add(1);
            ans.add(currentRow);
            prevRow = currentRow;
        }

        return ans; 
    }
}