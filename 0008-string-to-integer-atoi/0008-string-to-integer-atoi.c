#include <stdio.h>
#include <string.h>

#define INT_MIN -2147483648
#define INT_MAX 2147483647

int myAtoi(char* s) {
    int l = strlen(s);
    int sign = 1, i = 0;
    long ans = 0;

    while (i < l && s[i] == ' ') i++;

    if (i < l && (s[i] == '-' || s[i] == '+')) {
        sign = (s[i] == '-') ? -1 : 1;
        i++;
    }

    while (i < l && s[i] >= '0' && s[i] <= '9') {
        int num = s[i] - '0';
        if (ans > (INT_MAX - num) / 10) {
            return (sign == 1) ? INT_MAX : INT_MIN; 
        }
        ans = ans * 10 + num;
        i++;
    }

    return (int)(sign * ans);
}
