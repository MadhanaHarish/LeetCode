class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        boolean[] inStack = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = c - 'a';

            if (inStack[idx]) continue;

            while (!stack.isEmpty()
                    && stack.peek() > c
                    && lastIndex[stack.peek() - 'a'] > i) {

                inStack[stack.pop() - 'a'] = false;
            }

            stack.push(c);
            inStack[idx] = true;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pollLast());
        }

        return sb.toString();
    }
}
