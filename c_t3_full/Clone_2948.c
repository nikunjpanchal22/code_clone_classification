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
    int number = 548763, index = 0;
    char str [20] = "";
    while (number > 10) {
        number /= 10;
        index++;
    }
    str[index + 1] = 0;
    while (index >= 0) {
        str[index] = number % 10 + 48;
        number /= 10;
        index--;
    }
    printf ("the value of str is \"%s\"", str);
    return 0;
}


