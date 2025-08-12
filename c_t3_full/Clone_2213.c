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
    int err;
    err = scanf ("%lf", &v);
    err == 1 ? printf ("%lf\n", v) : puts ("read failed");
    return 0;
}


