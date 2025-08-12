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


#5
int main (int argc, char *argv[])
{
    int i, j;
    init_cpu();
    printf("System has: %d CPUs\n", NumCpus);
    while (1) {
        sample_cpus();
        for ( j = 0; j < NumCpus; j++ )
            printf("CPU #%d Load: %f\n", j, Loads[j]);
        usleep(1000000);
    }
    close_cpu();
}
