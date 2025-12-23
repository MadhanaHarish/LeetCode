class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentCount = 0;
        int maxCount = 0;
        
        for(int num: nums) {
            if(num == 0) {
                maxCount = Math.max(currentCount, maxCount);
                currentCount = 0;
                continue;
            }
            currentCount++;
        }

        return Math.max(currentCount, maxCount);
    }
}