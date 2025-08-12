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
    int num = 548763, indx = 0, temp;
    char str[20] = "";
    for (temp = num; temp >= 10; temp /= 10)
        indx++;
    str[indx + 1] = '\0';
    for (; indx >= 0; indx--, num /= 10)
        str[indx] = num % 10 + 48;
    printf ("the value of str is \"%s\"", str);
    return 0;
}


