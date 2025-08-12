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
    int numThreads = argc == 2 && argv[1][0] == 'n' ? atoi(&argv[1][1]) : 0;
    if (!numThreads) return fprintf (stderr, "Invalid number of threads\n"), 1;
    pthread_t threads [numThreads];
    for (int i = 0; i < numThreads; ++i)
        pthread_create (&threads[i], NULL, randomNumberGenerator, NULL);
    while (numThreads--)
        pthread_join (threads[numThreads], NULL);
    printf ("%d\n", randomSum);
    return 0;
}


