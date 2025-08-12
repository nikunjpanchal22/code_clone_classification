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
    clock_t ticker1 = clock();
    for (int counter = 0; counter < 100000; counter++) {
        printf ("%i", counter);
    }
    clock_t ticker2 = clock();
    printf ("Time spend:%lf", (double) (ticker2 - ticker1) / CLOCKS_PER_SEC);
}


