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


 int main(void)
{
    pthread_t consumerThread, producerThread;
    sem_t consumerSemaphore, producerSemaphore;
    sem_init(&consumerSemaphore, 0, 0);
    sem_init(&producerSemaphore, 0, 0);
    
    pthread_create(&consumerThread, NULL, consumer, NULL);
    pthread_create(&producerThread, NULL, producer, NULL);
    
    int i;
    for(i = 0; i < 2; i++) {
        pthread_join(consumerThread, NULL);
        pthread_join(producerThread, NULL);
    }
    
    sem_destroy(&consumerSemaphore);
    sem_destroy(&producerSemaphore);

    return 0;
}
