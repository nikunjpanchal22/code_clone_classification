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
    pthread_t threads[2];
    sem_t c_sem;
    sem_t p_sem;
    sem_init(&c_sem, 0, 0);
    sem_init(&p_sem, 0, 0);
    pthread_create(&threads[0], NULL, consumer, NULL);
    pthread_create(&threads[1], NULL, producer, NULL);
    int i;
    for(i = 0; i < 2; i++) {
        pthread_join(threads[i], NULL);
    }
    sem_destroy(&c_sem);
    sem_destroy(&p_sem);
    return 0;
}


