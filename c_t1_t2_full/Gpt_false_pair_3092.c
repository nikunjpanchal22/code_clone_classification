int main () {
    omp_set_num_threads (10);
    for (int i = 0; i < 5; i++) {
        printf ("x %d\n", i);
    }
    for (int i = 0; i < 5; i++) {
        printf (". %d\n", i);
    }
}


int main () {
    omp_set_num_threads (10);
    for (int j = 0; j < 5; j++) {
        printf ("x %d\n", j);
    }
    for (int j = 0; j < 5; j++) {
        printf (". %d\n", j);
    }
}
