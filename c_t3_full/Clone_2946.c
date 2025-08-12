int main () {
    int a = 548763, i = 0;
    char str [20] = "";
    int b = a;
    while (b >= 10) {
        b = b / 10;
        i++;
    }
    str[i + 1] = '\0';
    while (i >= 0) {
        str[i] = a % 10 + 48;
        a = a / 10;
        i--;
    }
    printf ("the value of str is \"%s\"", str);
    return 0;
}





#include <stdio.h>
int main () {
    int original = 548763, digit_count = 0;
    char str[20] = "";
    int copy = original;
    while (copy / 10 >= 1) {
        digit_count++;
        copy /= 10;
    }
    str[digit_count + 1] = '\0';
    while (digit_count > -1) {
        str[digit_count] = original % 10 + '0';
        original /= 10;
        digit_count--;
    }
    printf ("the value of str is \"%s\"", str);
    return 0;
}


