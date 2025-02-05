class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> d = new HashMap<>();
        int count = 0;
        for(int x: nums) { 
            d.put(x, d.getOrDefault(x, 0) + 1);
            if (d.get(x) <= 2) { 
                nums[count] = x; 
                count++;
            }
        }
        return count;
    }
}