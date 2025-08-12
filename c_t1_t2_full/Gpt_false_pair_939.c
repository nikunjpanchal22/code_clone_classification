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
    pthread_t thr_ids[NOTHREADS];
    int u_ids[NOTHREADS] = {1, 2};
    int err;
    long pass_time;
    int k;
    printf ("Activating Fun1 Thread \n");
    err = pthread_create (&thr_ids[0], NULL, fun1, &u_ids[0]);
    if (err) {
        printf ("Unable to create thread! \n");
        exit (-1);
    }
    printf ("Activating Fun2 Thread \n");
    err = pthread_create (&thr_ids[1], NULL, fun2, &u_ids[1]);
    if (err) {
        printf ("Unable to create thread! \n");
        exit (-1);
    }
    for (k = 0; k < NOTHREADS; k++) {
        pthread_join (thr_ids[k], NULL);
    }
    pthread_exit (NULL);
    return 0;
}
