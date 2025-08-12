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
    pthread_t identifiers[NOTHREADS];
    int info[NOTHREADS] = {1, 2};
    int result; 
    long timeline;
    int n;
    printf("Starting Fun1 Thread \n");
    result = pthread_create(&identifiers[0], NULL, fun1, &info[0]);
    if (result) {
        printf("Unable to create thread! \n");
        exit(-1);
    }
    printf("Starting Fun2 Thread \n");
    result = pthread_create(&identifiers[1], NULL, fun2, &info[1]);
    if (result) {
        printf("Unable to create thread! \n");
        exit(-1);
    }
    for (n = 0; n < NOTHREADS; n++) {
        pthread_join(identifiers[n], NULL);
    }
    pthread_exit(NULL);
    return 0;
}
