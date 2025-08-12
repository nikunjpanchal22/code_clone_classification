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
    pthread_t tid[2]; 
    sem_t semcon; 
    sem_t sempro; 
    
    sem_init(&semcon, 0, 0);
    sem_init(&sempro, 0, 0);
    pthread_create(&tid[0], NULL, consumer, NULL);
    pthread_create(&tid[1], NULL, producer, NULL);
    
    int i ;
    for (i = 0; i < 2; i++) {
    pthread_join(tid[i], NULL);
    }
    sem_destroy(&semcon);
    sem_destroy(&sempro);

    return 0; 

}


