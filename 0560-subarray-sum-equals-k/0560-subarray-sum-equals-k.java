class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int prefix = 0;
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, 1);
        for(int num: nums) {
            prefix += num;
            if(m.containsKey(prefix - k)) {
                count += m.get(prefix - k);
            }
            m.put(prefix, m.getOrDefault(prefix, 0) + 1);
        }
        return count;
    }
}