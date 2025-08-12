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
    pthread_t thread_ids[NOTHREADS];
    int data[NOTHREADS] = {1, 2};
    int rc;
    long duration;
    int counter;
    printf("Creating Fun1 Thread \n");
    rc = pthread_create(&thread_ids[0], NULL, fun1, &data[0]);
    if (rc) {
        printf("Failed to create thread! \n");
        exit(-1);
    }
    printf("Creating Fun2 Thread \n");
    rc = pthread_create(&thread_ids[1], NULL, fun2, &data[1]);
    if (rc) {
        printf("Failed to create thread! \n");
        exit(-1);
    }
    for (counter = 0; counter < NOTHREADS; counter++) {
        pthread_join(thread_ids[counter], NULL);
    }
    pthread_exit(NULL);
    return 0;
}
