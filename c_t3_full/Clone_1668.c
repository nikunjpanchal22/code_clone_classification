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
    long N = atoll (argv[1]);
    pthread_t *thread = (pthread_t *)malloc (N * sizeof (pthread_t));
    for (long i = 0; i < N; i++) {
        struct thread_arg arg;
        arg.value1 = (int)i;
        arg.value2 = 'f';
        arg.value3 = i / 10.0;
        struct thread_arg *p = (struct thread_arg *)malloc (sizeof *p);
        memcpy (p, &arg, sizeof(struct thread_arg));
        pthread_create (& thread [i], NULL,foo, p);
    }
    free (thread);
    pthread_exit (NULL);
}


