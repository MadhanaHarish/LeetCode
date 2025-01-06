class Solution {
    public String addBinary(String a, String b) {
        StringBuffer result = new StringBuffer();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i > -1 || j > -1 || carry == 1){
            if(i>=0) carry += a.charAt(i--) - '0';
            if(j>=0) carry += b.charAt(j--) - '0';
            result.append(String.valueOf(carry % 2));
            carry /= 2;
        }
        return result.reverse().toString(); 
    }
}