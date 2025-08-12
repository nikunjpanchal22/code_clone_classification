int main () {
    double v;
    int err;
    err = scanf ("%lf", &v);
    if (1 == err) {
        printf ("%lf\n", v);
    }
    else {
        printf ("read failed\n");
    }
    return 0;
}





#include <stdio.h>
int main () {
    double v;
    int err = scanf ("%lf", &v);
    if (err == EOF) {
        perror ("read failed");
    }
    else if (1 == err) {
        printf ("%lf\n", v);
    }
    return 0;
}


