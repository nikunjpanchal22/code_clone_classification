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
    for (int i = 1; i <= 6; ++i) {
        for (int j = 6; j > i; --j) {
            printf("+");
        }
        for (int k = 1; k < i; ++k) {
            printf("*");
        }
        printf("\n");
    }
    return 0;
}


