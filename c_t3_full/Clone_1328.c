int main (void) {
    pthread_t thread [THREADS_MAX];
    pthread_mutex_init (& m_init, NULL);
    pthread_cond_init (& c_init, NULL);
    for (size_t i = 0; i < THREADS_MAX; ++i) {
        pthread_mutex_lock (& m_init);
        init_done = 0;
        pthread_create (& thread [i], NULL, thread_function, & i);
        while (!init_done) {
            pthread_cond_wait (& c_init);
        }
        pthread_mutex_unlock (& m_init);
    }
    
}


 int main (void) {
pthread_t threads[THREADS_MAX];
pthread_mutex_t init_mutex;
pthread_cond_t init_cond;
   
pthread_mutex_init(&init_mutex, NULL);
pthread_cond_init(&init_cond, NULL);
for (size_t i = 0; i < THREADS_MAX; i++) {
    pthread_mutex_lock(&init_mutex);
    int init_done = 0;
    pthread_create(&threads[i], NULL, thread_function, &i);
    while(!init_done) {
        pthread_cond_wait(&init_cond, &init_mutex);
    }
    pthread_mutex_unlock(&init_mutex);
    }
     
}


