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
void find_largest(int a, int b, int c) {
            printf("%d is the greatest", a >= b && a >= c ? a : b >= c ? b : c);
        }
        int main() {
            int a, b, c;
            printf ("Enter three numbers: ");
            scanf ("%d %d %d", & a, & b, & c);
            find_largest(a, b, c);
            return 0;
}


