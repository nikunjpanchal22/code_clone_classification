int main (int argc, char *argv []) {
    int i, j;
    init_cpu ();
    printf ("System has: %d CPUs\n", NumCpus);
    for (i = 0; i < 20; i++) {
        sample_cpus ();
        for (j = 0; j < NumCpus; j++)
            printf ("CPU #%d: %f\n", j, Loads[j]);
        sleep (1);
    }
    close_cpu ();
}





void print_load(int j) {
    printf ("CPU #%d: %f\n", j, Loads[j]);
    }

int main (int argc, char *argv[]) {
    int i, j;
    void (*func_ptr)(int) = print_load;
    init_cpu ();
    printf ("System has: %d CPUs\n", NumCpus);
    for (i = 0; i < 20; i++) {
        sample_cpus ();
        for (j = 0; j < NumCpus; j++)
            (*func_ptr)(j);
        sleep (1);
    }
    close_cpu ();
}


