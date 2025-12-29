class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int l = 0;
        int r = height.length - 1;
        while(l < r) {
            int minHeight = Math.min(height[l], height[r]);
            int width = r - l;
            int currentArea = minHeight * width;
            maxArea = Math.max(maxArea, currentArea);
            if(height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
}