void main () {
    int m, row, col;
    int array [2] [5] [2] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 18, 21, 3, 4, 5, 6, 7, 81, 9, 11};
    int (*p) [5] [2];
    p = array;
    for (m = 0; m < 2; m++) {
        for (row = 0; row < 5; row++) {
            for (col = 0; col < 2; col++) {
                printf ("\n the vale is %d", * ((int *) (p + m) + (row * 2) + col));
            }
        }
    }
}



#include <stdio.h>

void main () {
    int i, j, k;
    int values [2] [5] [2] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 18, 21, 3, 4, 5, 6, 7, 81, 9, 11};
    int (*ptr) [5] [2];
    ptr = values;

    for (i = 0; i < 2; i++) for (j = 0; j < 5; j++) for (k = 0; k < 2; k++) printf ("\n %d", *((int*) (ptr + i) + (j * 2) + k));
}


