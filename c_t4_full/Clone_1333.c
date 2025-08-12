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
    char str1 [5] [100], i, j;
    for (i = 0; i < 5; i++) {
        fgets (str1 [i], 100, stdin);
    }
    for (j = 0; j < 5; j++) {
        fputs(str1 [j], stdout);
    }
    return 0;
}


