class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
            if(m.get(nums[i]) <= 2) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}