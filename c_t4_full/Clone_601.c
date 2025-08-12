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
    pthread_t ID[2];
    sem_t semaphore_C;
    sem_t semaphore_P;
    sem_init(&semaphore_C, 0, 0);
    sem_init(&semaphore_P, 0, 0);
    pthread_create(&ID[0], NULL, consumer, NULL);
    pthread_create(&ID[1], NULL, producer, NULL);
    int i;
    for(i = 0; i < 2; i++) {
        pthread_join(ID[i], NULL);
    }
    sem_destroy(&semaphore_C);
    sem_destroy(&semaphore_P);
    return 0;
}


