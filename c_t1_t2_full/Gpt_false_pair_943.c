int main () {
    pthread_t tids [NOTHREADS];
    int ids [NOTHREADS] = {1, 2};
    int ret;
    long t;
    int i;
    printf ("Creating fun1 thread \n");
    ret = pthread_create (&tids[0], NULL, fun1, &ids[0]);
    if (ret) {
        printf ("unable to create thread! \n");
        exit (- 1);
    }
    printf ("Creating fun2 thread \n");
    ret = pthread_create (&tids[1], NULL, fun2, &ids[1]);
    if (ret) {
        printf ("unable to create thread! \n");
        exit (- 1);
    }
    for (i = 0; i < NOTHREADS; i++) {
        pthread_join (tids [i], NULL);
    }
    pthread_exit (NULL);
    return 0;
}


 int main() {
    pthread_t thread_identifiers[NOTHREADS];
    int inputs[NOTHREADS] = {1, 2};
    int response;
    long execute_duration;
    int iterator;
    printf ("Creating Fun1 Thread \n");
    response = pthread_create(&thread_identifiers[0], NULL, fun1, &inputs[0]);
    if (response) {
        printf ("Failed to create thread! \n");
        exit (-1);
    }
    printf ("Creating Fun2 Thread \n");
    response = pthread_create(&thread_identifiers[1], NULL, fun2, &inputs[1]);
    if (response) {
        printf ("Failed to create thread! \n");
        exit (-1);
    }
    for (iterator = 0; iterator < NOTHREADS; iterator++) {
        pthread_join(thread_identifiers[iterator], NULL);
    }
    pthread_exit(NULL);
    return 0;
}
