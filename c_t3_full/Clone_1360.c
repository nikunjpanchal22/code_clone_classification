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
    int x = 0;
    pthread_create(&loop, NULL, timer, &i); 
    while (i > 0) {
        x++;
        printf("inc counter: %d \n", x);
        if (x == 10){
            i++;
            x=0;
        } 
    }
    printf("%d after\n", i);
    pthread_join(loop, NULL);
    return 0;
}


