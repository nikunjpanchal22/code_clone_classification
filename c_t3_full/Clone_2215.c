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
    printf ("%s\n", (1 == err) ? &v : "read failed");
    return 0;
}


