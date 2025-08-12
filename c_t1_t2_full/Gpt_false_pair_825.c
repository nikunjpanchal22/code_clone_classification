int main (void) {
    int start;
    if (scanf ("%d", &start) != 1)
        exit (1);
    int end = start;
    while (scanf ("%d", &end) == 1)
        ;
    for (int i = start; i <= end; i++)
        printf ("%d\n", i);
}


 int main (void) { 
    int start;
    while (scanf ("%d", &start) != 1){
        printf("Please enter a correct starting number:\n");
    }
    int end = start;
    while (scanf ("%d", &end) == 1)
        ;
    for (int i = start; i <= end; i++)
        printf ("%d\n", i);
}
