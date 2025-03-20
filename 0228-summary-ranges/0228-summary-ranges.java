class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if(nums.length == 0) return res;
        int st = nums[0], n = nums[0];
        Map<Integer, Integer> m = new LinkedHashMap<>();
        for(int x: nums) {
            if(x != n) {
                st = x;
                n = x;
            } 
            m.put(st, n);
            n++;
        }
        for(Integer x: m.keySet()){
            if(x.equals(m.get(x))) res.add(String.valueOf(x));
            else res.add(String.valueOf(x) + "->" + String.valueOf(m.get(x)));
        }
        return res;
    }
}