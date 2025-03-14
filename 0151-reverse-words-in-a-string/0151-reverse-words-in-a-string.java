class Solution {
    public String reverseWords(String s) {
        List<String> l = new ArrayList<>(Arrays.asList(s.trim().split("\\s+")));
        String res = new String();
        for(int i = l.size() - 1; i > -1; i--) {
            res += l.get(i) + " ";
        }
        return res.trim();
    }
}