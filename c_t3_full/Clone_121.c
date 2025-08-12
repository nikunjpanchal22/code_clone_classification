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


 int main(void) {
    long max = 1l, min = 0l, test;
    int i;
    for (i = 0; i < N; i++) {
        long one_plus_test;
        test = (max + min) / 2;
        one_plus_test = (1L + test);
        if (one_plus_test == 1L) {
            min = test;
        }
        else {
            max = test;
        }
    }
    printf("The epsilon machine is %.50lf\n", (double)max);
    return 0;
}


