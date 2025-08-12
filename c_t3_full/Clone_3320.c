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
    clock_t start_time = clock();
    for (int num = 0; num < 100000; num++) {
        printf ("%i", num);
    }
    clock_t end_time = clock();
    printf ("Elapsed Time:%lf", (double) (end_time - start_time) / CLOCKS_PER_SEC);
}


