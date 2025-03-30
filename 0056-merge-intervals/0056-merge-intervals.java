class Solution {
    public int[][] merge(int[][] arr) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ele = new ArrayList<>();
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        ele.add(arr[0][0]);
        ele.add(arr[0][1]);
        for(int i = 0; i < arr.length; i++) {
            if(arr[i][0] <= ele.get(1)) {
                int min_ele = arr[i][0] < ele.get(0) ? arr[i][0] : ele.get(0);
                int max_ele = arr[i][1] > ele.get(1) ? arr[i][1] : ele.get(1);
                ele.clear();
                ele.add(min_ele);
                ele.add(max_ele);
            } else {
                res.add(ele);
                ele = new ArrayList<>();
                ele.add(arr[i][0]);
                ele.add(arr[i][1]);
            }
        }
        res.add(ele);
        int[][] ans = new int[res.size()][2];
        for(int i = 0; i < res.size(); i++) {
            ans[i][0] = res.get(i).get(0);
            ans[i][1] = res.get(i).get(1);
        }
        return ans;
    }
}