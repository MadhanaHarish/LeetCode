class Solution {
    public int reverse(int x) {

        int sign = x > -1? 1: -1;

        x *= sign;

        int ans = 0;

        while(x >= 1) {
            int digit = x % 10;

            if (ans > (Integer.MAX_VALUE - digit) / 10)
                return 0;

            ans = ans * 10 + digit;
            x /= 10;
        }
        
        return sign * ans;
    }
}