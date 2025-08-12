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
    const char nOption = 'n';
    char *strNumThreads = NULL;
    while ((command = getopt (argc, argv, &nOption)) != -1)
        if (command == nOption) {
            strNumThreads = optarg;
            break;
        }
    srand(time(NULL));
    const int numThreads = atoi(strNumThreads);
    if (numThreads == 0) {
        fputs("Invalid number of threads\n", stderr);
        return 1;
    }
    pthread_t *threads = calloc(numThreads, sizeof(pthread_t));
    int i;
    for (i = 0; i < numThreads; i++)
        pthread_create(threads + i, NULL, randomNumberGenerator, NULL);
    for (i = 0; i < numThreads; i++)
        pthread_join(threads[i], NULL);
    printf("%d\n", randomSum);
    free(threads);
    return 0;
}


