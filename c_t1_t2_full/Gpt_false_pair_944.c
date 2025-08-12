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
    pthread_t p_ids[NOTHREADS];
    int d_ids[NOTHREADS] = {1, 2};
    int retCode;
    long timeElapsed;
    int count;
    printf("Creating Fun1 Thread \n");
    retCode = pthread_create(&p_ids[0], NULL, fun1, &d_ids[0]); 
    if (retCode) {
        printf("Unable to create thread! \n");
        exit(-1);
    }
    printf("Creating Fun2 Thread \n");
    retCode = pthread_create(&p_ids[1], NULL, fun2, &d_ids[1]); 
    if (retCode) {
        printf("Unable to create thread! \n");
        exit(-1);
    }
    for (count = 0; count < NOTHREADS; count++) {
        pthread_join(p_ids[count], NULL);
    }
    pthread_exit(NULL);
    return 0;
}
