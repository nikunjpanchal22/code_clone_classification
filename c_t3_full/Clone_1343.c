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
    pthread_t thread_A, thread_B;
    // creating semaphores
    sem_t semaphore_C;
    sem_t semaphore_P;
    //Initialize the semaphores 
    sem_init(&semaphore_C, 0, 0);
    sem_init(&semaphore_P, 0, 0);
    // creating the threads
    pthread_create(&thread_A, NULL, consumer, NULL);
    pthread_create(&thread_B, NULL, producer, NULL);
    
    // joining the threads
    int i = 0;
    for (i = 0; i < 2; i++) {
        pthread_join(thread_A, NULL);
        pthread_join(thread_B, NULL);
    }

    //destroying the semaphores
    sem_destroy(&semaphore_C);
    sem_destroy(&semaphore_P);
    
    return 0;
}


