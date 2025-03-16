class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int num: arr) {
            m.put(num, m.getOrDefault(num, 0) + 1);
        }
        List<Integer> l = new ArrayList<>();
        for(int num: m.values()) {
            if(l.contains(num)) return false;
            l.add(num);
        }
        return true;
    }
}