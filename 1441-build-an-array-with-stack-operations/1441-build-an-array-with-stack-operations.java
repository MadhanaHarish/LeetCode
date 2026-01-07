class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();

        int[] freq = new int[n + 1];

        for(int num: target) {
            freq[num] = 1;
        }

        for(int i = 1; i < target[target.length - 1] + 1; i++) {
            ans.add("Push");
            if(freq[i] == 0) ans.add("Pop");
        }

        return ans;
    }
}