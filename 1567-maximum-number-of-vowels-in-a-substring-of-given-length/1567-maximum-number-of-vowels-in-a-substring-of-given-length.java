class Solution {
    public int maxVowels(String s, int k) {
        int l = 0, r = 0, maxVowels = 0, count = 0;
        
        for (; r < k; r++) {
            if ("aeiou".contains(String.valueOf(s.charAt(r)))) count++;
        }
        maxVowels = count;

        while(r < s.length()) {
            if ("aeiou".contains(String.valueOf(s.charAt(r)))) count++; 
            if ("aeiou".contains(String.valueOf(s.charAt(l)))) count--;
            maxVowels = Math.max(maxVowels, count);
            l++;
            r++;
        }

        return maxVowels;
    }
}