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
    int j = 4;
    for (; j; --j) {
        pthread_t *tcb = malloc (sizeof (*tcb));
        pthread_create (tcb, NULL, threadfunc, (void *) j);
    }
    usleep (40000);
    return 0;
}
