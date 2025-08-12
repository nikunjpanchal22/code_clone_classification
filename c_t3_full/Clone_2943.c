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
    int a = 548763, i = 0;
    char str [20];
    int b = a;
    do {
        b /= 10;
        i++;
    } while (b >= 10);
    str [i + 1] = '\0';
    do {
        str[i] = a % 10 + '0';
        a /= 10;
        i--;
    } while (i >= 0);
    printf ("the value of str is \"%s\"", str);
    return 0;
}


