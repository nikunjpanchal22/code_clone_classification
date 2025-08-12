int main () {
    int i = 4;
    for (; i; --i) {
        pthread_t *tcb = malloc (sizeof (*tcb));
        pthread_create (tcb, NULL, threadfunc, (void *) i);
    }
    sleep (40);
    return 0;
}


int main () {
    int k = 4;
    for (; k; --k) {
        pthread_t *tth= malloc (sizeof(*tth));
        pthread_create (tth, NULL, threadfunc, (void *) k);
    }
    nanosleep ((const struct timespec[]){{0, 40000000L}}, NULL);
    return 0;
}
