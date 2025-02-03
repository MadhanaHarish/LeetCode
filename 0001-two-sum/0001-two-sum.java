class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> l = new ArrayList<>();
        for(int x: nums) {
            l.add(x);
        }
        for(int i=0; i<l.size(); i++) {
            int diff = target - l.get(i);
            if(l.contains(diff) && i != l.indexOf(diff)) return new int[]{i, l.indexOf(diff)};
        }
        return new int[]{-1, -1}; 
    }
}