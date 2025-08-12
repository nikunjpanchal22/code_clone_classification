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
    int i = 4;
    do {
        pthread_t *tcb = malloc(sizeof(*tcb));
        pthread_create(tcb, NULL, threadfunc, (void *)i);
        i--;
    } while (i > 0);
    sleep(40);
    return 0;
}


