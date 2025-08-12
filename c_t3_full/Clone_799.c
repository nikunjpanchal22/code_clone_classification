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
    if (scanf ("%d", &start) != 1)
        exit (1);
    printf ("Please enter the number which is bigger than %d\n", start);
    int end;
    if (scanf ("%d", &end) != 1)
        exit (1);
    for (int i = start; i <= end; i++)
        printf ("%d\n", i);
}


