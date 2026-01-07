class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        Map<Integer, Integer> m = new HashMap<>();

        for(int i = 0; i < n; i++) {
            m.putIfAbsent(sorted[i], i);
        }

        for(int i = 0; i < n; i++) {
            nums[i] = m.get(nums[i]);
        }

        return nums;
    }
}