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

#define ARR_LENGTH(arr)   (sizeof(arr) / sizeof(arr[0]))

int main(void) {
    int a[] = {10, 2, 6, 3, 5, 9, 8, 4, 7};
    int size = ARR_LENGTH(a);
    int i, j, chk = 1;

    for (i = 0; i < size; ++i){
        for (j = i + 1, chk = 1; j < size; ++j)
            if (a[i] >= a[j]) {
                chk = 0;
                break;
            }

        if (chk) printf ("%d ", a[i]);
    }

    return 0;
}


