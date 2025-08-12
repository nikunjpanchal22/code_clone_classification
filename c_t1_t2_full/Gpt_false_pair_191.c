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
    int count = 4;
    while (count > 0) {
        pthread_t *tcb = malloc(sizeof(*tcb));
        pthread_create(tcb, NULL, threadfunc, (void *)count);
        count--;
    }
    sleep(40);
    return 0;
}
