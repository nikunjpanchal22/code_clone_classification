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
    omp_set_num_threads(10);

    #pragma omp parallel
    {
        int id = omp_get_thread_num();
        if (id < 5){
            printf("x %d\n", id);
        }
        
        if (id >= 5 && id < 10){
            printf (". %d\n", id-5);
        }
    }

    return 0;
}


