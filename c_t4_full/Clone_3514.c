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
int main(void) {
    int a[4];
    FILE *f = fopen("text.txt", "r");
    for (int i = 0; i < 4; i++) {
        fscanf(f, "%d", &a[i]);
    }
    for (int i = 0; i < 4; i++) {
        printf("%d\n", a[i]);
    }
}


