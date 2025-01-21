class Solution {
public:
    string addStrings(string num1, string num2) {
        string result = "";
        int carry = 0, i = num1.size() - 1, j = num2.size() - 1;

        while (i >= 0 || j >= 0 || carry) {
            int digit1 = i >= 0 ? num1[i--] - '0' : 0; // Extract digit or 0 if out of bounds
            int digit2 = j >= 0 ? num2[j--] - '0' : 0; // Extract digit or 0 if out of bounds

            int sum = digit1 + digit2 + carry; 
            carry = sum / 10;                    // Update carry
            result.push_back((sum % 10) + '0');  // Append the last digit of the sum
        }

        reverse(result.begin(), result.end()); // Reverse to get the final result
        return result;
    }
};
