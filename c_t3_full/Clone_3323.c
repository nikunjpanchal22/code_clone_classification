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
    srand (time (NULL));
    char *strNumThreads = NULL;
    int command;
    while ((command = getopt (argc, argv, "n:")) != -1)
        if ('n' == command) {
            strNumThreads = optarg;
            break;
        }
    if (strNumThreads) {
        int numThreads = atoi(strNumThreads);
        if (numThreads <= 0) {
            fprintf (stderr, "Invalid number of threads\n");
            return 1;
        }
        pthread_t threads[numThreads];
        int i;
        for(i = 0; i < numThreads; i++) pthread_create(threads + i, NULL, randomNumberGenerator, NULL);
        for(i = 0; i < numThreads; i++) pthread_join(threads[i], NULL);
        printf("%d\n", randomSum);
    } else {
        fprintf (stderr, "No threads\n");
        return 1;
    }
    return 0;
}


