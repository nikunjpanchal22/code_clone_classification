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
    int numbers[3], i, largest;
    printf ("Enter three numbers: ");
    for(i=0; i<3; i++) scanf ("%d", & numbers[i]);
    largest = numbers[0] > numbers[1] ? numbers[0] : numbers[1];
    largest = numbers[2] > largest ? numbers[2] : largest;
    printf("%d is the greatest", largest);
}


