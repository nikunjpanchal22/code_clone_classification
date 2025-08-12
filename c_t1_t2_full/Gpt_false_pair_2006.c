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
        d[i] = (double) rand () / (double) (RAND_MAX + 1.0);
    }
    insertion_sort(d, 100, sizeof(*d), cmp_double);

    for (i = 0; i < 100; i++)
        printf ("%.10lf\n", d[i]);
    return 0;
}
