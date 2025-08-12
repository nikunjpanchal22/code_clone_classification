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



 

int main (int argc, char *argv[]) {
    int N = atoi(argv[1]);
    pthread_t thread[N];
    for (int j = 0; j < N; j++) {
        struct thread_arg arg;
        arg.value1 = j + 2;
        arg.value2 = 'H';
        arg.value3 = j / 3.0;
        pthread_create(&thread [j], NULL, foo, &arg);
    }
    pthread_exit (NULL);
}


