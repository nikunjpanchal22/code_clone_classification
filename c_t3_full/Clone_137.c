int main () {
    int i = 4;
    for (; i; --i) {
        pthread_t *tcb = malloc (sizeof (*tcb));
        pthread_create (tcb, NULL, threadfunc, (void *) i);
    }
    sleep (40);
    return 0;
}


 int main() {
    const int count = 4;
    for (int i = count; i > 0; i--) {
        pthread_t *tcb = malloc(sizeof(*tcb));
        pthread_create(tcb, NULL, threadfunc, (void *)i);
    }
    sleep(40);
    return 0;
}


