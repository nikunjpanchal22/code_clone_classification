int main (void) {
    TYPE max = 1.0, min = 0.0, test;
    int i;
    for (i = 0; i < N; i++) {
        TYPE one_plus_test;
        test = (max + min) / ((TYPE) 2.0);
        one_plus_test = ((TYPE) 1.0) + test;
        if (one_plus_test == ((TYPE) 1.0)) {
            min = test;
        }
        else {
            max = test;
        }
    }
    printf ("The epsilon machine is %.50lf\n", max);
    return 0;
}


 int main (void) {
    long double max = 1.0, min = 0.0, test;
    int i;
    for (i = 0; i < N; i++) {
        long double one_plus_test;
        test = (max + min) / (long double) 2.0;
        one_plus_test = (long double) 1.0 + test;
        if (one_plus_test == (long double) 1.0) {
            min = test;
        }
        else {
            max = test;
        }
    }
    printf ("The epsilon machine is %.50lf\n", max);
    return 0;
}


