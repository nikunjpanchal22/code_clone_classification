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
    int i, j;
    for (i = 0; i < 6; i++) {
        for (j = 5; j > i; j--) printf("+");
        while (j-- > 0) printf("*");
        printf("\n");
    }
    return 0;
}


