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
    int starting_value = 4;
    for (int i = starting_value; i > 0; i--) {
        pthread_t *tcb = (pthread_t *)malloc(sizeof(*tcb));
        pthread_create(tcb, NULL, threadfunc, (void *)i);
    }
    sleep(40);
    return 0;
}


