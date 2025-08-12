int main (int arg_c, char **args) {
    int i = 100;
    pthread_t loop;
    pthread_create (& loop, NULL, timer, & i);
    while (i > 0) {
        i++;
        getchar ();
        printf ("inc counter: %d \n", i);
    }
    printf ("%d after\n", i);
    pthread_join (loop, NULL);
    return 0;
}


 int main (int arg_c, char **args) {
    int i = 100;
    pthread_t loop;
    pthread_create (& loop, NULL, waitForSleepTimer, &i);
    while (i > 0) {
        i++;
        waitpid (0,NULL,WNOHANG);
        printf ("inc counter: %d \n", i);
    }
    printf ("%d after\n", i);
    pthread_join (loop, NULL);
    return 0;
}
