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
    size_t i;
    int n = sizeof a / sizeof * a; 
    for (i = 0; i < n / 2; i++) {
        int temp = a[i];
        a[i] = a[n - i - 1]; 
        a[n - i - 1] = temp; 
    }
    for (i = 0; i < sizeof a / sizeof *a; i++)
        printf (" %2d", a[i]);
    putchar ('\n');
    return 0;
}


