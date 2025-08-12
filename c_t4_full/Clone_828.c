int main () {
    clock_t begin = clock ();
    int i;
    for (i = 0; i < 100000; i++) {
        printf ("%d", i);
    }
    clock_t end = clock ();
    printf ("Time taken:%lf", (double) (end - begin) / CLOCKS_PER_SEC);
}


 int main () {
    timeval begin, end;
    gettimeofday(&begin, NULL);
    int i;
    for( i = 0; i < 100000; i++) {
        printf ("%d", i);
    }
    gettimeofday(&end, NULL);
    double taken = end.tv_usec - begin.tv_usec;
    printf ("Time taken: %lf", taken);
}


