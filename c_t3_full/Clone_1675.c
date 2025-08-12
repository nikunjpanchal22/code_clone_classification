int main (void) {
    double d [100];
    int i;
    for (i = 0; i < 100; i++)
        d[i] = rand () / ((double) RAND_MAX + 1);
    qsort3way (d, 100, sizeof (* d), cmp_double);
    for (i = 0; i < 100; i++)
        printf ("%.10lf\n", d[i]);
    return 0;
}


 int main (void) {
    double d [100];
    int i;

    for (i = 0; i < 100; i++) {
        d[i] = rand() / (RAND_MAX + 1.0);
    }

    mergesort(d, 0, 99, sizeof(*d), cmp_double);

    for (i = 0; i < 100; i++)
        printf ("%.10lf\n", d[i]);
    return 0;
}


