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
    long long j;

    pthread_create(&loop, NULL, timer, &i);
    for(j=0; j<1LL<<40; j++) {
        if(i==0) {
            break;
        }
        i++;
        getchar();
        printf("inc counter: %d \n", i);
    }
    printf("%d\n", i);
    pthread_join(loop, NULL);
    return 0;
}


