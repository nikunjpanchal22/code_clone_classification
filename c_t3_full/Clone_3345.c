int main () {
    int a [4], i;
    FILE *point = fopen ("test.txt", "r");
    for (i = 0; i < 4; i++) {
        fscanf (point, "%d,", & a [i]);
    }
    for (i = 0; i < 4; i++) {
        printf ("%d\n", a [i]);
    }
}




#include <stdio.h>
int main () {
    int array[4];
    FILE *filep = fopen ("file.txt", "r");
    for (int i = 0; i < 4; i++) {
        fscanf (filep, "%d,", &array [i]);
    }
    for (int i = 0; i < 4; i++) {
        printf ("%d\n", array [i]);
    }
}


