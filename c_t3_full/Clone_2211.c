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
    if (fscanf (stdin, "%lf", &v) != 1) {
        fputs ("read failed\n", stdout);
    }
    else {
        fprintf (stdout, "%lf\n", v);
    }
    return 0;
}


