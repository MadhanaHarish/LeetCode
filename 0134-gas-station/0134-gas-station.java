class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int current_tank = 0, total_tank = 0, balance = 0, result = 0;
        for(int i = 0; i < gas.length; i++) {
            balance = gas[i] - cost[i];
            total_tank += balance;
            current_tank += balance;
            if(current_tank < 0) {
                result = i + 1;
                current_tank = 0;
            }
        }
        if(total_tank < 0) return -1;
        else return result;
    }
}