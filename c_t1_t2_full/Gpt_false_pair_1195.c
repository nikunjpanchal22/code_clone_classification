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


 int main (void) {
    int a [] = {10, 2, 6, 3, -1, 5, 9, 8, 4, 7};
    int i, j, p, n = sizeof (a) / sizeof (a[0]);
    p = a[0];
    i = 0;
    // Iterate each element in the array except the first element
    for (j = 1; j < n; j++) {
        // Compare current element to the smallest element
        if (a[j] < p) {
            // Set the current element index as the smallest index
            i = j;
            // Set the current element as the smallest element
            p = a[i];
        }
    }
    // Print out the smallest element 
    printf ("%d ", p);
    i = find_next (a, n, i +1, p);
    // Use a loop to find the next smallest element until the array ends
    while (i < n) {
        p = a[i];
        printf ("%d ", p);
        i = find_next (a, n, i +1, p);
    }
    printf ("\n");
    return 0;
}
