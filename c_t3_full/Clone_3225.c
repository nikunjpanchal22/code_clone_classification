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

int main() {
    omp_set_num_threads(10);

    #pragma omp simd
    for(int i = 0; i < 5; i++) {
        printf("x %d\n", i);
    }
 
    #pragma omp simd
    for(int i = 0; i < 5; i++) {
        printf(". %d\n", i);
    }
    return 0;
}


