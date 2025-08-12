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
    size_t N = (size_t) strtoul (argv[1], NULL, 0);
    pthread_t *thread = (pthread_t *)malloc (N * sizeof (pthread_t));
    for (size_t i = 0; i < N; i++) {
        struct thread_arg arg;
        arg.value1 = (int)i;
        arg.value2 = 'f';
        arg.value3 = (float)(i/10.0);
        struct thread_arg *p = (struct thread_arg *)malloc (sizeof *p);
        *p = arg;
        pthread_create (& thread [i], NULL, foo, p);
    }
    free (thread);
    pthread_exit (NULL);
}


