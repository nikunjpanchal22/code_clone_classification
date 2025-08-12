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
    int numThreads = 0;
    srand (time (NULL));
    command = getopt (argc, argv, "n:");
    if ('n' == command) {
        numThreads = atoi(optarg);
    }
    if (numThreads == 0) return fprintf (stderr, "Invalid number of threads\n"), 1;
    pthread_t *threads = malloc(sizeof(pthread_t) * numThreads);
    for (int i = 0; i < numThreads; i++) {
        pthread_create (&threads[i], NULL, randomNumberGenerator, NULL);
    }
    for (int i = 0; i < numThreads; i++) {
        pthread_join (threads[i], NULL);
    }
    printf ("%d\n", randomSum);
    free(threads);
    return 0;
}


