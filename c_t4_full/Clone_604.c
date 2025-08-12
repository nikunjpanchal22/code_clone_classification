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
    pthread_t threadids[2];
    sem_t semCon;
    sem_t semPro;

    sem_init(&semCon, 0, 0);
    sem_init(&semPro, 0, 0);
    pthread_create(&threadids[0], NULL, consumer, NULL);
    pthread_create(&threadids[1], NULL, producer, NULL);
    int i;
    for(i = 0; i < 2; i++) {
        pthread_join(threadids[i], NULL);
    }

    sem_destroy(&semCon);
    sem_destroy(&semPro);
    return 0;
}


