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


int main (int argc, char *argv []) {
    int N = atoi (argv[1]);
    pthread_t *thread = malloc (N * sizeof (pthread_t));
    for (int i = 0; i < N; i++) {
        struct thread_arg arg;
        if(i % 3 == 0)
            arg.value1 = i;
        else
            arg.value1 = i * 2;
        arg.value2 = 'f';
        arg.value3 = i / 10.0;
        struct thread_arg *p = malloc (sizeof *p);
        *p = arg;
        pthread_create (& thread [i], NULL, foo, p);
    }
    free (thread);
    pthread_exit (NULL);
}
