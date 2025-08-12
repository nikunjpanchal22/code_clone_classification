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
    size_t start = 0; 
    size_t end = sizeof a / sizeof *a - 1; 
    while (start < end) {
       int temp = a[start]; 
       a[start] = a[end]; 
       a[end] = temp; 
       start++;
       end--;
    }
    for (size_t i = 0; i < sizeof a / sizeof *a; i++)
        printf (" %2d", a[i]);
    putchar ('\n');
    return 0;
}


