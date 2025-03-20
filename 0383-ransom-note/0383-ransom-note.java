class Solution {
    public boolean canConstruct(String r, String m) {
        List<Character> l = new ArrayList<>();
        for (char c : r.toCharArray()) {
            l.add(c);
        }
        for(char c: m.toCharArray()) {
            l.remove(Character.valueOf(c));
        }
        return l.size() == 0;
    }
}