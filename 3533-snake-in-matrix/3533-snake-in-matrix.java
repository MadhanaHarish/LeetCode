class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i = 0, j = 0;
        for(String x: commands) {
            if(x.equals("DOWN")) i++;
            else if(x.equals("UP")) i--;
            else if(x.equals("RIGHT")) j++;
            else j--;
        }
        int res = i * n + j;
        return res;
    }
}