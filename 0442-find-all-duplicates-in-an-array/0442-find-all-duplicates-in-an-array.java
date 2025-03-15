class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int x: nums) {
            if(m.getOrDefault(x, 0) == 1) res.add(x);
            m.put(x, 1);
        }
        return res;
    }
}