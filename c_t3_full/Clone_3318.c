int main () {
    clock_t begin = clock ();
    int i;
    for (i = 0; i < 100000; i++) {
        printf ("%d", i);
    }
    clock_t end = clock ();
    printf ("Time taken:%lf", (double) (end - begin) / CLOCKS_PER_SEC);
}





#include <stdio.h>
#include <time.h>
int main () {
    clock_t start = clock();
    for (int i = 0; i < 100000; i++)
        printf ("%d", i);
    clock_t stop = clock();
    double elapsed_seconds = (double)(stop - start) / CLOCKS_PER_SEC;
    printf("Elapsed time: %.2f seconds\n", elapsed_seconds);
    return 0;
}


