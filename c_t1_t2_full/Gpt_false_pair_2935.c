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


int main (int argc, char *argv []) {
    int i, j;
    init_gpu ();
    printf ("System has: %d GPUs\n", NumGpus);
    for (i = 0; i < 20; i++) {
        sample_gpus ();
        for (j = 0; j < NumGpus; j++)
            printf ("GPU #%d: %f\n", j, Loads[j]);
        sleep (1);
    }
    close_gpu ();
}
