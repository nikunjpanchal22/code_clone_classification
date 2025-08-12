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
    int max = 1, min = 0, test;
    int i;
    for (i = 0; i < N; i++) {
        int one_plus_test;
        test = (max + min) / 2;
        one_plus_test = (1 + test);
        if (one_plus_test == 1) {
            min = test;
        }
        else {
            max = test;
        }
    }
    printf("The epsilon machine is %.50lf\n", (double)max);
    return 0;
}


