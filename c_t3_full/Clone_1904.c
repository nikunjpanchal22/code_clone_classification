int main (int argc, char *argv []) {
    int command;
    char *strNumThreads = NULL;
    int i;
    while ((command = getopt (argc, argv, "n:")) != -1) {
        if (command == 'n') {
            strNumThreads = optarg;
            break;
        }
    }
    srand (time (NULL));
    int numThreads = atoi (strNumThreads);
    if (numThreads == 0) {
        fprintf (stderr, "Invalid number of threads\n");
        return 1;
    }
    pthread_t threads [numThreads];
    for (i = 0; i < numThreads; i++) {
        pthread_create (threads + i, NULL, randomNumberGenerator, NULL);
    }
    for (i = 0; i < numThreads; ++i)
        pthread_join (threads[i], NULL);
    printf ("%d\n", randomSum);
    return 0;
}


 int main (int argc, char *argv []) {
    int command;
    char *strNumThreads = NULL;
    int i;
    while ((command = getopt (argc, argv, "n:")) != -1) {
        if (command == 'n') {
            strNumThreads = optarg;
            break;
        }
    }
    int randomNum;
    int numThreads = atoi (strNumThreads);
    if (numThreads == 0) {
        fprintf (stderr, "Invalid number of threads\n");
        return 1;
    }
    pthread_t threads [numThreads];
    int randomVals[numThreads];
    for (i = 0; i < numThreads; i++) {
        randomNum = random () % 1000 + 1;
        randomVals[i] = randomNum;
        char *tmp;
        sprintf (tmp, "%d", randomNum);
        pthread_create (threads + i, NULL, randomNumberGenerator, tmp);
    }
    for (i = 0; i < numThreads; ++i)
        pthread_join (threads[i], NULL);
    printf ("Random values generated were: ");
    for (i = 0; i < numThreads; ++i)
        printf ("%d ", randomVals[i]);
    printf ("\n");
    printf ("Sum of random values: %d\n", randomSum);
    return 0;
}


