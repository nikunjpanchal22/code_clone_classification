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
    for (i = 1; i <= 10; i++) {
        fputs ("Enter a number: ", stdout);
        if (scanf ("%lf", &num[i - 1]) != 1) {
            fputs ("read error", stdout);
            return 1;
        }
    }
    return 0;
}


