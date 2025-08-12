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
    char ch1 = '+', ch2 = '*';
    int n = 6, m = 5;
    for (int i = 0; i < n; ++i) {
        for (int k = i; k < m; ++k) {
            putchar(ch1);
        }
        for (int j = 0; j < i; ++j) {
            putchar(ch2);
        }
        putchar('\n');
    }
    return 0;
}


