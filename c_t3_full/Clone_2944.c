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
    int total= 548763, j= 0;
    int backup = total;
    char res [20] = "";
    while (backup > 10) {
        backup/= 10;
        ++j;
    }
    res[j + 1] = '\0';
    do {
        res[j] = total % 10 + 48;
        total/= 10;
        j--;
    } while (j >= 0);
    printf ("the value of res is \"%s\"", res);
    return 0;
}


