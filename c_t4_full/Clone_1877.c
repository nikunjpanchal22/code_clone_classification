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



 


int main () {
    int start=end=i=0;
    if (scanf ("%d", &start) != 1)
        return EXIT_FAILURE;

    while (scanf ("%d", &end) == 1){
    }
    while(start<=end){
        printf ("%d\n", start++);
    }
    return 0;
}


