class Solution {
    public void setZeroes(int[][] arr) {
        List<List<Integer>> index = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == 0) {
                    index.add(new ArrayList<>(Arrays.asList(i, j)));
                }
            }
        }
        for(List<Integer> x: index) {
            for(int row = 0; row < arr.length; row++) {
                arr[row][x.get(1)] = 0;
            }
            for(int col = 0; col < arr[0].length; col++) {
                arr[x.get(0)][col] = 0;
            }
        }
    }
}