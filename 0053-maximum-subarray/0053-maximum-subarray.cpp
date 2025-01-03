class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int sum = 0;
        int res = INT_MIN;
        for(auto ele: nums){
            sum += ele;
            res = max(res, sum);
            if(sum < 0) sum = 0;
        }
        return res;
    }
};