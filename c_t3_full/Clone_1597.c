int main () {
    int ch, i;
    pthread_t *t;
    printf ("Enter the number of threads you want to create : ");
    scanf ("%d", & ch);
    t = (pthread_t *) malloc (ch * sizeof (pthread_t));
    for (i = 0; i < ch; i++) {
        pthread_create (& t [i], NULL, print, NULL);
    }
    for (i = 0; i < ch; i++) {
        pthread_join (t [i], NULL);
    }
}


 int main () {
    int ch, i, status;
    pthread_t *t;
    printf ("Enter the number of threads you want to create : ");
    scanf ("%d", & ch);
    t = (pthread_t *) malloc (ch * sizeof (pthread_t));
    for (i = 0; i < ch; i++) {
        status = pthread_create (& t [i], NULL, print, NULL);
        if (status != 0){
            exit(EXIT_FAILURE);
        }
    }
    for (i = 0; i < ch; i++) {
        pthread_join (t [i], NULL);
    }
}


