class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_count = Integer.MIN_VALUE;
        int cur_count = 0;
        for(int num: nums) {
            if(num == 0) {
                max_count = Math.max(max_count, cur_count);
                cur_count = -1;
            }
            cur_count++;
        }
        return Math.max(max_count, cur_count);
    }
}