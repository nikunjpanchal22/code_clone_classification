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
    int c = 0;
    pthread_t loop;
    pthread_create(&loop, NULL, timer, &i);
    while (i > 0) {
        getchar();
        if (c == 3){
            i++;
            printf("inc counter: %d \n", i);
            c = 0;
        }
        c++;
    }
    printf("%d after\n", i);
    pthread_join(loop, NULL);
    return 0;
}


