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
int main() {
    omp_set_num_threads(10);

    #pragma omp for collapse(2)
    for(int i = 0; i < 5; i++) {
        for(int j = 0; j < 1; j++) {
            printf("x %d\n", i);
        }
    }

    #pragma omp for collapse(2)
    for(int i = 0; i < 5; i++) {
        for(int j = 0; j < 1; j++) {
            printf(". %d\n", i);
        }
    }

    return 0;
}


