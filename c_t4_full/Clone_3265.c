int main () {
    omp_set_num_threads (10);
    for (int i = 0; i < 5; i++) {
        printf ("x %d\n", i);
    }
    for (int i = 0; i < 5; i++) {
        printf (". %d\n", i);
    }
}




pp
#include <omp.h>
#include <stdio.h>

int main () {
    int n = omp_get_max_threads();
    omp_set_num_threads(10);
    #pragma omp parallel for
    for (int i = 0; i < 5; i++) {
        printf("x: %d, Thread: %d\n", i, omp_get_thread_num());
    }
    omp_set_num_threads (n);
    #pragma omp parallel for
    for (int i = 0; i < 5; i++) {
        printf (". %d, Thread: %d\n", i, omp_get_thread_num());
    }
}


