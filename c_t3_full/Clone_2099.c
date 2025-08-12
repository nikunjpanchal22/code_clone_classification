int main (void) {
    clock_t start, end;
    start = clock ();
    int c;
    for (int i = 0; i < 100; i++) {
        for (int j = 0; j < (1 << 30); j++) {
            c++;
        }
    }
    end = clock ();
    printf ("start = %d, end = %d\n", start, end);
    return 0;
}



 

#include <omp.h>
#include <stdio.h>
int main() {
    double start = omp_get_wtime();
    int c;
    for (int i = 0; i < 100; i++) {
        for (int j = 0; j < (1 << 30); j++) {
            c++;
        }
    }
    double end = omp_get_wtime();
    printf("start = %f, end = %f\n", start, end);
    return 0;
}


