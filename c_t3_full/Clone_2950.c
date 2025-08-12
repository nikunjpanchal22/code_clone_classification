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
    int data = 548763, k = 0, backup;
    char str[20] = "";
    for (backup = data; backup >= 10; backup /= 10)
        k++;
    str[k+1] = '\0';
    for (; k >= 0; k--, data /= 10)
        str[k] = data % 10 + 48;
    printf ("the value of str is \"%s\"", str);
    return 0;
}


