int main () {
    int a = 85;
    int b = 71;
    int i = 0;
    while (1) {
        scanf ("%d %d", & a, & b);
        printf ("%d: %d + %d = %d\n", ++ i, a, b, sum (a, b));
    }
    return 0;
}





#include <stdio.h>
inline int sum(int a, int b) {
            return a + b;
        }
        int main () {
            int a = 85;
            int b = 71;
            int i = 0;
            while (1) {
                scanf ("%d %d", & a, & b);
                printf ("%d: %d + %d = %d\n", ++ i, a, b, sum (a, b));
            }
            return 0;
}


