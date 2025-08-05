class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, max_len = 0;
        Set<Character> buffer = new HashSet<>();
        for(int right = 0; right < s.length(); right++) {
            while(buffer.contains(s.charAt(right))) {
                buffer.remove(s.charAt(left++));
            }
            buffer.add(s.charAt(right));
            max_len = Math.max(max_len, right - left + 1);
        }
        return max_len;
    }
}