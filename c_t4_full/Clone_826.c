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
    timer_t begin;
    clock_gettime(CLOCK_MONOTONIC, &begin);
    int i;
    for (i = 0; i < 100000; i++) {
        printf ("%d", i);
    }
    timer_t end;
    clock_gettime(CLOCK_MONOTONIC, &end);
    seconds_t taken = end.tv_sec - begin.tv_sec;
    printf ("Time taken: %ld", taken);
}


