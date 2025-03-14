class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        for(int i = 0; i < citations.length; i++) {
            int toLastIndex = citations.length - i;
            if(citations[i] >= toLastIndex) return toLastIndex;
        }
        return 0;
    }
}