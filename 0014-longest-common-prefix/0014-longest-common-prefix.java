class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];
        else if(strs.length == 0) return "";
        else {
            String prefix = new String(strs[0]);
            for(int i = 1; i < strs.length; i++) {
                while(strs[i].indexOf(prefix) != 0) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                }
            }
            return prefix;
        }
    }
}