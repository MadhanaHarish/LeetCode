class Solution {
    public int longestContinuousSubstring(String s) {
        if(s.length() == 0) return 0;
        int currentLen = 1;
        int maxLen = 1;
        for(int i = 1;i < s.length(); i++) {
            if(s.charAt(i) - s.charAt(i - 1) - 0 == 1) {
                currentLen++;
            } else {
                maxLen = Math.max(currentLen, maxLen);
                currentLen = 1;
            }
        }
        return Math.max(currentLen, maxLen);
    }
}