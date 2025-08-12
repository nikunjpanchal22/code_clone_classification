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

int index = 0;
#pragma omp threadprivate(index)

int main() {
    omp_set_num_threads(10);

    #pragma omp parallel
    {
        for (index = 0; index < 5; index++)
            printf("x %d\n", index);

        for (index = 0; index < 5; index++)
            printf(". %d\n", index);
    }
    return 0;
}


