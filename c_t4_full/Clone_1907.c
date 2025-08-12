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




#include <stdio.h>
#include <pthread.h>
#include <semaphore.h>
sem_t completed;
void* threadfunc(void* argument) {
    /* Modification of function behavior */
    sem_post(&completed);
    pthread_exit(NULL);
}


