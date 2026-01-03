class Solution {
    public boolean isSubsequence(String s, String t) {

        if(s.length() == 0) return true;

        Queue<Character> string = new LinkedList<>();

        for(char c: s.toCharArray()) {
            string.add(c);
        }
   
        for(char c: t.toCharArray()) {
            if(!string.isEmpty() && c == string.peek()) string.poll(); 
        }

        return string.isEmpty();
    }
}

