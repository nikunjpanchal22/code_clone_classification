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


 int main () {
    pthread_t handler[NOTHREADS];
    int ids[NOTHREADS] = {1, 2};
    int result;
    long dur;
    int c;
    printf ("Initiating Fun1 Thread \n");
    result = pthread_create (&handler[0], NULL, fun1, &ids[0]);
    if (result) {
        printf ("Failed to create thread! \n");
        exit (-1);
    }
    printf ("Initiating Fun2 Thread \n");
    result = pthread_create (&handler[1], NULL, fun2, &ids[1]);
    if (result) {
        printf ("Failed to create thread! \n");
        exit (-1);
    }
    for (c = 0; c < NOTHREADS; c++) {
        pthread_join (handler[c], NULL);
    }
    pthread_exit (NULL);
    return 0;
}
