class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();

        int slow = s.length() - 1;

        while (slow >= 0 && s.charAt(slow) != ' ') {
            slow--;
        }

        return s.length() - slow - 1;
    }
}
