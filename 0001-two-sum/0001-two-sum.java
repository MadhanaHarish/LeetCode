class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> l = new ArrayList<>();
        for(int x: nums) {
            l.add(x);
        }
        for(int i=0; i<l.size(); i++) {
            for(int j=i+1; j<l.size(); j++) {
                if(l.get(i) + l.get(j) == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1}; 
    }
}