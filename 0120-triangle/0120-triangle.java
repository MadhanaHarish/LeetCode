class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i = 1; i < triangle.size(); i++) {
            for(int j = 0; j < triangle.get(i).size(); j++) {
                triangle.get(i).set(j,
                    triangle.get(i).get(j) +
                    Math.min(
                    j > 0 ? triangle.get(i - 1).get(j - 1) : Integer.MAX_VALUE,
                    j < triangle.get(i - 1).size() ? triangle.get(i - 1).get(j) : Integer.MAX_VALUE
                    )
                );
            }
        }

        int min_sum = Integer.MAX_VALUE;

        for(int num: triangle.get(triangle.size() - 1)) {
            min_sum = Math.min(min_sum, num);
        }

        return min_sum;
    }
}