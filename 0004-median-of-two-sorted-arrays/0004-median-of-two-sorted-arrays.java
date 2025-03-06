class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] arr = new int[n];
        int first = 0, second = 0, i = 0;
        while(first < nums1.length && second < nums2.length) {
            if(nums1[first] < nums2[second]) {
                arr[i] = nums1[first++];
            } else {
                arr[i] = nums2[second++];
            }
            i++;
        }
        while(first < nums1.length) {
            arr[i] = nums1[first++];
            i++;
        }
        while(second < nums2.length) {
            arr[i] = nums2[second++];
            i++;
        }
        int middle = n / 2;
        if(n % 2 == 0) {
            return (arr[middle] + arr[middle - 1]) / 2.0;
        } 
        return arr[middle];
    }
}