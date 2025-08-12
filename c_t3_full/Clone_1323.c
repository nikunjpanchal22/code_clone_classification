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
    pthread_t thread [THREADS_MAX];
    pthread_mutex_t m_init;
    pthread_cond_t c_init;
    pthread_mutex_init(&m_init, NULL);
    pthread_cond_init(&c_init, NULL);
    for (size_t i = 0; i < THREADS_MAX; ++i) {
        pthread_mutex_lock(&m_init);
        int is_initialized = 0;
        pthread_create(&thread[i], NULL, thread_function, &i);
        while (!is_initialized) {
            pthread_cond_wait(&c_init, &m_init);
        }
        pthread_mutex_unlock(&m_init);
    }
    
}


