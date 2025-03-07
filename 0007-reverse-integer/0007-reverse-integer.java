class Solution {
    public int reverse(int n) {
        int sign = n > 0 ? 1 : -1;
        int res = 0, x = sign * n;
        while(x > 0) {
            if (res > (Integer.MAX_VALUE - x % 10) / 10) {
                return 0;
            }
            res = res * 10 + x % 10;
            x /= 10;
        }
        return sign * res;
    }
}