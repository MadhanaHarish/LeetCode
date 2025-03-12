class Solution {
    public int getLastMoment(int l, int[] left, int[] right) {
        Arrays.sort(left);
        Arrays.sort(right);
        int min1 = 0, min2 = 0;
        if(left.length > 0) min1 = left[left.length - 1];
        if(right.length > 0) min2 = l - right[0];
        return Math.max(min1, min2);
    }
}