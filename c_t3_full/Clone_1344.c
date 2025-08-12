int main (void) {
    pthread_t tid0, tid1;
    sem_init (& semP, 0, 0);
    sem_init (& semC, 0, 0);
    pthread_create (& tid0, NULL, consumer, NULL);
    pthread_create (& tid1, NULL, producer, NULL);
    pthread_join (tid0, NULL);
    pthread_join (tid1, NULL);
    sem_destroy (& semC);
    sem_destroy (& semP);
    return 0;
}


int main () {
    pthread_t cons_thread, prod_thread;
    sem_t consumer_sem, producer_sem;
    sem_init(&consumer_sem, 0, 0);
    sem_init(&producer_sem, 0, 0);
    pthread_create(&cons_thread, NULL, consumer, NULL);
    pthread_create(&prod_thread, NULL, producer, NULL);

    int i = 0;
    for (i = 0; i < 2; i++) {
        pthread_join(cons_thread, NULL);
        pthread_join(prod_thread, NULL);
    }
    sem_destroy(&consumer_sem);
    sem_destroy(&producer_sem);
    return 0;
}


