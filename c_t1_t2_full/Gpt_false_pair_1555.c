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


int main()
{
    pthread_t thread_1, thread_2;
    sem_t consumer, producer;
    sem_init(&consumer, 0, 0);
    sem_init(&producer, 0, 0);
    pthread_create(&thread_1, NULL, consumer, NULL);
    pthread_create(&thread_2, NULL, producer, NULL);
    pthread_join(thread_1, NULL);
    pthread_join(thread_2, NULL);
    sem_destroy(&producer);
    sem_destroy(&consumer);
    return 0;
}
