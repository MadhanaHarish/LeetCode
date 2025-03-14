class Solution {
    public int jump(int[] nums) {
        if(nums.length < 2) return 0;
        int steps = 0;
        int jumpEnd = 0;
        int maxValue = 0;
        for(int i = 0; i < nums.length; i++) {
            maxValue = Math.max(maxValue, i + nums[i]);
            if(i == jumpEnd) {
                steps += 1;
                jumpEnd = maxValue;
                if(jumpEnd >= nums.length - 1) {
                    return steps;
                }
            }
        }
        return steps;
    }
}