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
    int input = 548763, counter = 0;
    char string [20] = "";
    int temp = input;
    while (temp > 10) {
        temp /= 10;
        counter++;
    }
    string[counter + 1] = '\0';
    for(; counter >= 0; counter--) {
        string[counter] = input % 10 + 48;
        input /= 10;
    }
    printf ("the value of string is \"%s\"", string);
    return 0;
}


