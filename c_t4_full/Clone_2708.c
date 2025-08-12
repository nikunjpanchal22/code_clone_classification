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
void main() {
    int a, b, c, max;
    printf ("Enter three numbers: ");
    scanf ("%d %d %d", &a, &b, &c);
    max = (a>b?a:b)>c?(a>b?a:b):c;
    printf("%d is greatest", max);
}


