class Solution {
    public String convertToBase7(int num) {
        int sum = 0, i = 0;
        int sign = num > 0? 1: -1;
        num = Math.abs(num);
        while(num >= 7){
            sum = (num % 7) * ((int)Math.pow(10,i)) + sum;
            num = num / 7;
            i++;
        }
        sum = (num % 7) * ((int)Math.pow(10,i)) + sum;
        return String.valueOf(sign * sum);
    }
}