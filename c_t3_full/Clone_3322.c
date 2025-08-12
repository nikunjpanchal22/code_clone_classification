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
    clock_t initial_time = clock();
    for (int variable = 0; variable < 100000; variable++) {
        printf ("%i", variable);
    }
    clock_t final_time = clock();
    printf ("Time taken:%lf", (double) (final_time - initial_time) / CLOCKS_PER_SEC);
}


