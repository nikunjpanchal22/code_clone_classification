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


#2
int main (int argc, char *argv[])
{
    int i, j;
    init_cpu();
    printf("System has: %d CPUs\n", NumCpus);
    for (i = 0; i < 20; i++) {
        sample_cpus();
        for (j = 0; j < NumCpus; j++) { 
            printf("CPU #%d CPU Load: %f\n", j, Loads[j]);
        } 
        usleep(1000);
    }
    close_cpu();
}
