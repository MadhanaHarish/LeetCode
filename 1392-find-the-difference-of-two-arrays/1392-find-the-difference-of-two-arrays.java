class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        for(int i = 0; i < nums1.length; i++) {
            s1.add(nums1[i]);
        }
        Set<Integer> common = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int i = 0; i < nums2.length; i++) {
            if(s1.contains(nums2[i])) common.add(nums2[i]);
            else s2.add(nums2[i]);
        }
        s1.removeAll(common);
        s2.removeAll(common);
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>(s1));
        res.add(new ArrayList<>(s2));
        return res;
    }
}