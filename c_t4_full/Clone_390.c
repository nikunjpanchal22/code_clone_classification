int main (void) {
    int a [] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    size_t i;
    rev3 (a, sizeof a / sizeof * a);
    for (i = 0; i < sizeof a / sizeof *a; i++)
        printf (" %2d", a[i]);
    putchar ('\n');
    return 0;
}


 
int main (void) {
    int a [] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    size_t n = sizeof a / sizeof * a; 
    int (*p)[n] = &a; 
    for (int i = 0, j = n-1; i < j; i++, j--) 
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    } 
    for (size_t i = 0; i < sizeof a / sizeof *a; i++)
        printf (" %2d", a[i]);
    putchar ('\n');
    return 0;
}


