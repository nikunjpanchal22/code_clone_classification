int main () {
    int a [] = {10, 2, 6, 3, 5, 9, 8, 4, 7};
    int l = sizeof a / sizeof a[0];
    int i, j;
    int check = 1;
    for (i = 0; i < l; i++) {
        check = 1;
        for (j = i + 1; j < l; j++) {
            if (a[i] >= a[j]) {
                check = 0;
            }
        }
        if (check)
            printf ("%d", a[i]);
    }
    printf ("\n");
    return 0;
}





#include <stdio.h>
#define SIZE 9

int main() {
    int a[SIZE] = {10, 2, 6, 3, 5, 9, 8, 4, 7};
    int i, j, isBiggest;

    for (i = 0; i < SIZE; i++) {
        isBiggest = 1;
        for (j = i + 1; j < SIZE; j++) {
            if (a[i] >= a[j]) {
                isBiggest = 0;
                break;
            }
        }
        if (isBiggest) printf ("%d ", a[i]);
    }

    printf ("\n");
    return 0;
}


