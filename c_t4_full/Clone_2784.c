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





void *producer(void *arg) {
            for(int i=0; i<5; i++) {
                sem_wait(&semC);
                printf("Producing...\n");
                sem_post(&semP);
            }
            return NULL;
        }

        void *consumer(void *arg) {
            for(int i=0; i<5; i++) {
                sem_wait(&semP);
                printf("Consuming...\n");
                sem_post(&semC);
            }
            return NULL;
}


