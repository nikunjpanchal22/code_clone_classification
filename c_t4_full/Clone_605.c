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


  int main (void) {
    pthread_t thread_id[2];
    sem_t sem_consume;
    sem_t sem_produce; 
    sem_init(&sem_consume, 0, 0);
    sem_init(&sem_produce, 0, 0);
    pthread_create(&thread_id[0], NULL, consumer, NULL);
    pthread_create(&thread_id[1], NULL, producer, NULL);
    for (int i = 0; i < 2; i++){
        pthread_join(thread_id[i], NULL);
    } 
    sem_destroy(&sem_consume);
    sem_destroy(&sem_produce);
    return 0;
}


