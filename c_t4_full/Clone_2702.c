main () {
    int a, b, c;
    printf ("enter three numbers: ");
    scanf ("%d %d %d", & a, & b, & c);
    if (a >= b) {
        if (a >= c) {
            printf ("%d is greatest", a);
        }
        else {
            printf ("%d is greatest", c);
        }
    }
    else {
        if (b >= c) {
            printf ("%d is greatest", b);
        }
        else {
            printf ("%d is greatest", c);
        }
    }
}





#include <stdio.h>
int main() {
    int a, b, c, d[3], largest, i=0;
    printf ("Enter three numbers: ");
    scanf ("%d %d %d", & d[0], & d[1], & d[2]);
    largest = d[0];
    for(i=0;i<3;i++) if (d[i]>largest) largest = d[i];
    printf("%d is greatest", largest);
    return 0;
}


