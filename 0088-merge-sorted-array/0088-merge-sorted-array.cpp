class Solution {
public:
    void mergeSort(vector<int>& arr, int l, int m, int r) {
        int left = l;
        int right = m + 1;
        vector<int> temp;
        while(left <= m && right <= r){
            if(arr[left] < arr[right]){
                temp.push_back(arr[left++]);
            } else {
                temp.push_back(arr[right++]);
            }
        }
        while(left<=m) {
            temp.push_back(arr[left++]);
        }
        while(right<=r) {
            temp.push_back(arr[right++]);
        }
        for(int i=l; i<=r; i++){
            arr[i] = temp[i-l];
        }
    }
    void solve(vector<int>& arr, int l, int r){
        if(l<r){
            int m = (l+r)/2;
            solve(arr, l, m);
            solve(arr, m+1, r);
            mergeSort(arr, l, m, r);
        }
    }
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        solve(nums1, 0, m+n-1);
    }
};