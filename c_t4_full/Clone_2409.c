int main () {
    for (int i = 0; i < 6; i++) {
        for (int k = i; k < 5; k++) {
            printf ("+");
        }
        for (int j = 0; j < i; j++) {
            printf ("*");
        }
        printf ("\n");
    }
    return 0;
}



 

#include<stdio.h>
int main () {
    int i, k, j;
    for (i = 0; i < 6; i++) {
        for (k= i; k < 5; ++k) {
            putchar(43);
        }
        for (j = 0; j < i; ++j) {
            putchar(42);
        }
        putchar(10);
    }
    return 0;
}


