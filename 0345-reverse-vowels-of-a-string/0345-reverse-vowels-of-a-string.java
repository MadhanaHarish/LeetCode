class Solution {
    public String reverseVowels(String s) {
        List<Character> l = new ArrayList<>();
        for(Character x: s.toCharArray()) {
            if("aeiou".indexOf(Character.toLowerCase(x)) != -1) {
                l.add(x);
            }
        }
        StringBuilder res = new StringBuilder();
        for(Character x: s.toCharArray()) {
            if("aeiou".indexOf(Character.toLowerCase(x)) != -1) {
                res.append(l.remove(l.size() - 1));
            } else {
                res.append(x);
            }
        }
        return res.toString();
    }
}