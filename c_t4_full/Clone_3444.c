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
    time_t start, end;
    double cpu_time_used;
    start = clock();
    for (int i = 0; i < 100000; i++) {
        printf ("%i", i);
    }
    end = clock();
    cpu_time_used = ((double) (end - start)) / CLOCKS_PER_SEC;
    printf ("Time elapsed is %lf seconds\n", cpu_time_used);
    return 0;
}


