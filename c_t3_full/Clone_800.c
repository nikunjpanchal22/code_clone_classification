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
    printf ("Enter ending number: ");
    int end;
    while (scanf ("%d", &end) != 1 || end < start)
        printf ("Please enter a number that is greater than %d: ", start);
    for (int i = start; i <= end; i++)
        printf ("%d\n", i);
}


