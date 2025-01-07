char* intToRoman(int num) {
    char* ones[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    char* tens[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    char* hrns[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    char* ths[] = {"", "M", "MM", "MMM"};

    static char result[20];
    result[0] = '\0'; 

    strcat(result, ths[num / 1000]);
    strcat(result, hrns[(num % 1000) / 100]);
    strcat(result, tens[(num % 100) / 10]);
    strcat(result, ones[num % 10]);

    return result;
}