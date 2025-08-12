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





int main (int argc, char *argv[]) {
    int i = 0, j;
    init_cpu ();
    printf ("System has: %d CPUs\n", NumCpus);
    while(i < 20) {
        sample_cpus ();
        j = NumCpus - 1;
        while(j >= 0) {
            printf ("CPU #%d: %f\n", j, Loads[j]);
            j--;
        }
        sleep (1);
        i++;
    }
    close_cpu ();
}


