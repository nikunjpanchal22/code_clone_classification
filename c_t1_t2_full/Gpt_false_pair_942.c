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
    pthread_t t_id[NOTHREADS];
    int user_id[NOTHREADS] = {1,2};
    int thread_status; 
    long thread_execution_timer;
    int iterator;
    printf ("Creating fun1 thread \n");
    thread_status = pthread_create(&t_id[0], NULL, fun1, &user_id[0]); 
    if (thread_status) {
        printf ("unable to create thread! \n");
        exit (-1);
    }
    printf ("Creating fun2 thread \n");
    thread_status = pthread_create(&t_id[1], NULL, fun2, &user_id[1]);
    if (thread_status) {
        printf ("unable to create thread! \n");
        exit (-1);
    }
    for (iterator = 0; iterator < NOTHREADS; iterator++) {
        pthread_join (t_id[iterator], NULL);
    }
    pthread_exit(NULL);
    return 0; 
}
