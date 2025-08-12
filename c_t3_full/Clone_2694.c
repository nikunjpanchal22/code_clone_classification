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
#define len(x)  (sizeof(x) / sizeof((x)[0]))

int main() {
    int a [] = {10, 2, 6, 3, 5, 9, 8, 4, 7};
    int l = len(a);
    int i, j, check;

    for (i = 0; i < l; ++i) {
        for (j = i+1, check = 1; j < l; ++j) {
            if (a[i] >= a[j]) { check = 0; break; }
        }
        if (check) printf ("%d ", a[i]);
    }

    printf ("\n");
    return 0;
}


