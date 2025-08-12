int main () {
    char str [5] [100];
    for (int i = 0; i < 5; i++) {
        fgets (str [i], 100, stdin);
    }
    for (int j = 0; j < 5; j++) {
        printf ("%s\n", str [j]);
    }
    return 0;
}



#include <stdio.h>
int main () {
    char strArr [5] [100], a;
    for (a = 0; a < 5; a++) {
        fgets (strArr [a], 100, stdin);
    }
    for (a = 0; a < 5; a++) {
        printf ("%s\n", strArr [a]);
    }
    return 0;
}


