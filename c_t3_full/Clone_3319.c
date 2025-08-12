int main () {
    clock_t begin = clock ();
    int i;
    for (i = 0; i < 100000; i++) {
        printf ("%d", i);
    }
    clock_t end = clock ();
    printf ("Time taken:%lf", (double) (end - begin) / CLOCKS_PER_SEC);
}





#include <time.h>
#include <stdio.h>
int main () {
    clock_t start_clock = clock();
    for (int i = 0; i < 100000; i++)
        printf ("%d", i);
    clock_t end_clock = clock();
    printf ("Execution Time:%lf", (double) (end_clock - start_clock) / CLOCKS_PER_SEC);
}


