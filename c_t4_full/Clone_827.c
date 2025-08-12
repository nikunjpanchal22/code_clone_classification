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
    time_t begin, end;
    time(&begin);
    int i;
    for (i = 0; i < 100000; i++) {
        printf ("%d", i);
    }
    time(&end);
    double elapsed_time = difftime(end, begin);
    printf ("Time taken: %lf", elapsed_time);
}


