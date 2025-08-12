int main (void) {
    int i;
    double num [10];
    for (i = 1; i <= 10; i++) {
        printf ("Enter a number: ");
        if (scanf ("%lf", &num[i - 1]) != 1) {
            puts ("read error");
            return 1;
        }
    }
    return 0;
}





#include <stdio.h>
int main () {
    int i;
    double num [10];
    for (i = 0; i < 10; i++) {
        printf ("Enter number %d: ", i + 1);
        if (scanf ("%lf", &num[i]) != 1) {
            puts ("read error");
            return 1;
        }
    }
    return 0;
}


