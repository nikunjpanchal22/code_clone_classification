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
    for (int i = 0; i < 5; i++) {
        printf ("y %d\n", i);
    }
    for (int i = 0; i < 5; i++) {
        printf ("* %d\n", i);
    }
}
