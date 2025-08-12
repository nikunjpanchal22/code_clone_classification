int main (void) {
    int a [] = {10, 2, 6, 3, -1, 5, 9, 8, 4, 7};
    int i, j, p, n = sizeof (a) / sizeof (a[0]);
    p = a[0];
    i = 0;
    for (j = i + 1; j < n; j++) {
        if (a[j] < p) {
            i = j;
            p = a[i];
        }
    }
    printf ("%d ", p);
    i = find_next (a, n, i +1, p);
    while (i < n) {
        p = a[i];
        printf ("%d ", p);
        i = find_next (a, n, i +1, p);
    }
    printf ("\n");
    return 0;
}






int find_next(int a[], int n, int i, int p) {
    int j, mini = INT_MAX, index = i;
    for (j = i; j < n; j++) 
        if (a[j] < mini && a[j] > p) {
            mini = a[j];
            index = j;
        }
    return (mini == INT_MAX) ? n : index;
}


