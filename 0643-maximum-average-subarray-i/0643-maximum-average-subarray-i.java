class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l = 0, r = nums.length, max = Integer.MIN_VALUE;
        if(nums.length > k) r = k;
        while(r <= nums.length) {
            int sum = 0, st = l;
            while(st < r) {
                sum += nums[st];
                st++;
            }
            if(sum > max) max = sum;
            l++;
            r++;
        }
        return (double)max/k;
    }
}