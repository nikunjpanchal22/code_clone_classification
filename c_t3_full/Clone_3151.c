int main (int argc, char *argv []) {
    int N = atoi (argv[1]);
    pthread_t *thread = malloc (N * sizeof (pthread_t));
    for (int i = 0; i < N; i++) {
        struct thread_arg arg;
        arg.value1 = i;
        arg.value2 = 'f';
        arg.value3 = i / 10.0;
        struct thread_arg *p = malloc (sizeof *p);
        *p = arg;
        pthread_create (& thread [i], NULL, foo, p);
    }
    free (thread);
    pthread_exit (NULL);
}



 

#define MAX_THREAD 1024
int main (int argc, char *argv[]) {
    int N = atoi(argv[1]);
    if(N > MAX_THREAD) N = MAX_THREAD;
    pthread_t thread[MAX_THREAD];
    for (int i = 0; i < N; i++) {
        struct thread_arg arg;
        arg.value1 = i;
        arg.value2 = 'Y';
        arg.value3 = i / 9.0;
        pthread_create(&thread [i], NULL, foo, &arg);
    }
    pthread_exit (NULL);
}


