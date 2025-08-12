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
    int start;
    if (scanf ("%d", &start) != 1)
        return -1;
    int end = start;
    while (scanf ("%d", &end) == 1);
    for (int i = start; i < end + 1; i++)
        printf ("%d\n", i);
    return 0;
}


