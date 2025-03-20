import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" "); // Split s into words
        if (pattern.length() != words.length) return false; // Check word count
        
        Map<Character, String> mapPatternToWord = new HashMap<>();
        Map<String, Character> mapWordToPattern = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (mapPatternToWord.containsKey(ch) && !mapPatternToWord.get(ch).equals(word)) return false;
            if (mapWordToPattern.containsKey(word) && mapWordToPattern.get(word) != ch) return false;

            mapPatternToWord.put(ch, word);
            mapWordToPattern.put(word, ch);
        }

        return true;
    }
}
