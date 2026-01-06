class Solution {
    public int integerBreak(int n) {
        if(n <= 2) return 1;
        if(n == 3) return 2;
        int k = n % 3;
        int exp = n / 3;
        if(n % 3 == 1) {
            exp--;
            k = 4;
        }
        return (int)Math.pow(3, exp) * (k > 0? k: 1);
    }
}