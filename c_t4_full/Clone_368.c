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
    int start, end;
    if (scanf ("%d%d", &start, &end) != 2)
        exit (1);
    for (int i = start; i <= end; i++)
        printf ("%d\n", i);
}


