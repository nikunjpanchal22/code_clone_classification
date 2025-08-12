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
    char strings [5] [100];
    int a, b;
    for (a = 0; a < 5; a++) {
        scanf ("%99[^\n]%*c", strings [a]);
    }
    for (b = 0; b < 5; b++) {
        printf ("%s\n", strings [b]);
    }
    return 0;
}


