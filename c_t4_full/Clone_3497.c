int main () {
    int i, c = 0, value = 4567, r, arr [10];
    while (value) {
        r = value % 10;
        arr[c++] = r;
        value /= 10;
    }
    for (i = c - 1; i >= 0; i--) {
        printf ("%d", arr [i]);
    }
    return 0;
}





#include <stdio.h>
int main () {
    int i = 0, c = 0, value = 4567, arr [10];
    while (value) {
        arr[c] = value % 10;
        c++;
        value /= 10;
    }
    while (i < c) {
        printf ("%d", arr [--c]);
    }
    return 0;
}


