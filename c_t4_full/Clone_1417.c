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
    err = scanf ("%10lf", &v); // limit input to 10 characters
    printf ((1 == err) ? "%lf\n" : "read failed\n", v);
    return 0;
}


