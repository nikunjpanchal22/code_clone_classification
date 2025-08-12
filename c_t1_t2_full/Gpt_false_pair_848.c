int main () {
    pthread_t pth;
    if (sem_init (&completed, 0, 0)) {
        printf ("sem_init failed\n");
        return 1;
    }
    pthread_create (& pth, NULL, threadfunc, "foo");
    sem_wait (& completed);
    printf ("Wait completed\n");
    pthread_cancel (pth);
    sem_destroy (& completed);
}


 
int main () {
    pthread_t pth;
    if (sem_init (&completed, 0, 0)) {
        printf ("sem_init failed\n");
        return 1;
    }
    pthread_create (& pth, NULL, threadfunc, "foo");
    sem_wait (& completed);
    if(sem_trywait (& completed) > 0) 
        printf ("Wait completed\n");
    pthread_cancel (pth);
    sem_destroy (& completed);
}
