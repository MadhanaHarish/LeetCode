class Solution {
    public void BackTrack(int start, List<List<Integer>> res, List<Integer> curr, int[] candidates, int target) {
        if(target < 0) {
            return;
        }
        if(target == 0) {
            res.add(new ArrayList(curr));
            return;
        }
        for(int i = start; i < candidates.length; i++) {
            curr.add(candidates[i]);
            BackTrack(i, res, curr, candidates, target - candidates[i]);
            curr.remove(curr.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res =  new ArrayList<>();
        List<Integer> curr = new LinkedList<>();
        BackTrack(0, res, curr, candidates, target);
        return res;
    }
}